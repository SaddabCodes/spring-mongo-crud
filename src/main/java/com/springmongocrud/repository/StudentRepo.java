package com.springmongocrud.repository;

import com.springmongocrud.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<StudentEntity,Integer> {
}
