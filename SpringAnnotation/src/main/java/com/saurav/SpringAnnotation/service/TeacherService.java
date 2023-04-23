package com.saurav.SpringAnnotation.service;

import ComponentScanTest.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    Teacher t1;
    public String teacherServiceCalling(){
        return t1.teach();
    }
}
