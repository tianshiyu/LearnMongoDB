package com.dishi.dao;

import com.dishi.nosql.mongodb.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface StudentDao extends MongoRepository<Student, String> {
    List<Student> findByName(String name);
    Student findByStudentId(Long studentId);
    List<Student> findByTeacherId(Long teacherId);
    List<Student> findByClassId(Long classId);
}
