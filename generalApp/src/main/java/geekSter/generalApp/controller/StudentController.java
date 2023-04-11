package geekSter.generalApp.controller;

import geekSter.generalApp.model.Student;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public  String getInfoAboutStudent(){
        String message = "This is critical information about student";
        return message;
    }
    @PostMapping(value = "/student")
    public  String saveInfoAboutStudent1(@RequestBody Student obj){
        System.out.println(obj.getStudentID());
        System.out.println(obj.getStudentName());
        System.out.println(obj.getAge());
        System.out.println(obj.getRollNum());
        System.out.println(obj.getGrade());
        System.out.println(obj.getDateOfBirth());
        System.out.println(obj.getGender());
        String message = "This is critical information about student so please save";
        return message;
    }
    @PutMapping(value = "/student")
    public  String updateInfoAboutStudent3(){
        String message = "This is critical information about student so update this";
        return message;
    }
    @DeleteMapping(value = "/student")
    public  String deleteInfoAboutStudent4(){
        String message = "This is critical information about student so please delete";
        return message;
    }
//    public void student(){
//        Student obj = new Student();
//        obj.setStudentName("saurav Jha");
//        System.out.println(obj.getStudentName());
//        obj.setGender("Male");
//        System.out.println(obj.getGender());
//        obj.setDateOfBirth("24/02/1998");
//        System.out.println(obj.getDateOfBirth());
//        obj.setAge(25);
//        System.out.println(obj.getAge());
//    }
}
