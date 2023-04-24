package com.saurav.ToDoApp.controller;

import com.saurav.ToDoApp.service.ToDoService;
import com.saurav.ToDoApp.service.model.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoController {
    @Autowired
    ToDoService toDoService;
    @GetMapping(value = "/getToDoList")
    public List<ToDo> getAllToDo(){
        return toDoService.getAllToDoInMyList();
    }
    @PostMapping(value = "/addToDo")
    public String addToDo(@RequestBody ToDo toDo){
       return toDoService.addMyToDo(toDo);
    }
    @RequestMapping(value = "getToDoByID/{ID}",method = RequestMethod.GET)
    public ToDo getToDOById(@PathVariable String ID){
        return toDoService.getToDoByID(ID);
    }
}
