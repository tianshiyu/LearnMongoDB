package com.dishi.service.impl;

import com.dishi.dao.StudentDao;
import com.dishi.nosql.mongodb.Student;
import com.dishi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int create(Student student) {
        student.setId(null);
        studentDao.insert(student);
        return 1;
    }

    @Override
    public int delete(String id) {
        Student student = new Student();
        student.setId(id);
        studentDao.delete(student);
        return 1;
    }

    @Override
    public List<Student> findStudentsByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public Student findStudentByStudentId(Long studentId) {
        return studentDao.findByStudentId(studentId);
    }

    @Override
    public List<Student> findStudentsByTeacherId(Long teacherId) {
        return studentDao.findByTeacherId(teacherId);
    }

    @Override
    public List<Student> findStudentsByClassId(Long classId) {
        return studentDao.findByClassId(classId);
    }
}
