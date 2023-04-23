package com.saurav.SpringAnnotation.Controller;

import com.saurav.SpringAnnotation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    @Qualifier("subham")
    Student s1;
    @GetMapping(value = "/student")
    public Student getStudent(){
        return s1;
    }
}
