package geekSter.generalApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @GetMapping(value = "/student")
    public  String getInfoAboutStudent(){
        String message = "This is critical information about student";
        return message;
    }
    @PostMapping(value = "/student")
    public  String saveInfoAboutStudent1(){
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
}
