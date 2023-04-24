package com.saurav.SpringAnnotation.Controller;

import com.saurav.SpringAnnotation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping(value = "/getName")
    public String getStudentName(@RequestParam("R_name") String name){
        System.out.println("This param name is :-> "+name);
        return "This Param name is :-> "+name;
    }
    //path Variable
    @GetMapping(value = "/getPath/{name}/{age}/{from}")
    public String getStudentPath(@PathVariable String name, @PathVariable int age, @PathVariable String from){
        System.out.println("My name is "+name+" , my age "+age+" and i am from "+from);
        return "My name is "+name+" , my age "+age+" and I am from "+from;
    }

}
