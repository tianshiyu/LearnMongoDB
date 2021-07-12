package com.dishi.service;

import com.dishi.nosql.mongodb.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    int create(Student student);
    int delete(String id);
    List<Student> findStudentsByName(String name);
    Student findStudentByStudentId(Long studentId);
    List<Student> findStudentsByTeacherId(Long teacherId);
    List<Student> findStudentsByClassId(Long classId);
}
