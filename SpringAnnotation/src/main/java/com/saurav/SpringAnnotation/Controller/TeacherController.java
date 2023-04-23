package com.saurav.SpringAnnotation.Controller;

import ComponentScanTest.Teacher;
import com.saurav.SpringAnnotation.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class TeacherController {
    @Autowired
    TeacherService TS;
    @RequestMapping(value = "/teach",method = RequestMethod.GET)
    @ResponseBody
    public String teach()
    {
        return TS.teacherServiceCalling();

    }
}
