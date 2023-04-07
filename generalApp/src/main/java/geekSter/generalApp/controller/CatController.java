package geekSter.generalApp.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {
    @GetMapping (value = "/cat")
    public String getInfo(){
        String message = "this is the general information about cat";
        return message;
    }
    @PostMapping(value = "/cat")
    public String saveMessage(@RequestBody String requestMessage){
        JSONObject obj = new JSONObject(requestMessage);

        System.out.println(obj.getString("Name"));
        return "file :--> " + obj;
    }
}
