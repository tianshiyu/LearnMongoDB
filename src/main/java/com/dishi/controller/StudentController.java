package com.dishi.controller;

import com.dishi.common.response.ServerResponse;
import com.dishi.nosql.mongodb.Student;
import com.dishi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("create")
    public ServerResponse createStudent(@RequestBody Student student){
        if(studentService.create(student)>0){
            return ServerResponse.ok();
        }else {
            return ServerResponse.error(1, "记录生成失败");
        }
    }

    @GetMapping("delete")
    public ServerResponse delete(@RequestParam String id) {
        if(studentService.delete(id)>0){
            return ServerResponse.ok();
        }else {
            return ServerResponse.error(1, "记录删除失败");
        }
    }

    @GetMapping("findByName")
    public ServerResponse findStudentsByName(@RequestParam String name) {
        List<Student> students = studentService.findStudentsByName(name);
        return ServerResponse.ok().put("data", students);
    }

    @GetMapping("findByStudentId")
    public ServerResponse findStudentByStudentId(@RequestParam Long studentId) {
        Student student = studentService.findStudentByStudentId(studentId);
        return ServerResponse.ok().put("data", student);
    }
}
