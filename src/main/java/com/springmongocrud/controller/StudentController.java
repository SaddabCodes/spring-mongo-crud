package com.springmongocrud.controller;


import com.springmongocrud.entity.StudentEntity;
import com.springmongocrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public StudentEntity saveStudentData(@RequestBody StudentEntity studentEntity) {
        return studentService.saveStudent(studentEntity);
    }

    @GetMapping("/get")
    public List<StudentEntity> getAllStudent() {
        return studentService.getAllStudent();
    }

    @GetMapping("/{byId}")
    public StudentEntity findStudentById(@PathVariable("byId") int id) {
        return studentService.getById(id);
    }

    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(@PathVariable int id, @RequestBody StudentEntity studentEntity) {
        return studentService.updateStudent(id, studentEntity);
    }

    @DeleteMapping("/delete/{deleteId}")
    public String deleteStudent(@PathVariable("deleteId") int id) {
        return studentService.deleteStudentById(id);
    }
}
