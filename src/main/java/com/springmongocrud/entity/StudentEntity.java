package com.springmongocrud.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("student_info")
@Data
public class StudentEntity {

    @Id
    private int std_id;
    private String first_name;
    private String last_name;
    private String department;

}
