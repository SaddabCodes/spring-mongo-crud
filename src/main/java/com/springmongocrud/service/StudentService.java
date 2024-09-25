package com.springmongocrud.service;


import com.springmongocrud.entity.StudentEntity;
import com.springmongocrud.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentEntity saveStudent(StudentEntity studentEntity) {
        return studentRepo.save(studentEntity);
    }

    public List<StudentEntity> getAllStudent() {
        return studentRepo.findAll();
    }

    public StudentEntity getById(int id) {
        return studentRepo.findById(id).get();
    }

    public StudentEntity updateStudent(int id, StudentEntity studentEntity) {
        StudentEntity existingStudent = studentRepo.findById(id).get();

        existingStudent.setStd_id(studentEntity.getStd_id());
        existingStudent.setFirst_name(studentEntity.getFirst_name());
        existingStudent.setLast_name(studentEntity.getLast_name());
        existingStudent.setDepartment(studentEntity.getDepartment());
        return studentRepo.save(existingStudent);
    }

    public String deleteStudentById(int id) {
        studentRepo.deleteById(id);
        return id + " deleted successfully";
    }

}
