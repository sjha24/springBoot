package com.saurav.ToDoApp.service;

import com.saurav.ToDoApp.service.model.ToDo;
import com.saurav.ToDoApp.repository.ToDoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    ToDoDao toDoDao;

    public List<ToDo> getAllToDoInMyList() {
        return toDoDao.getToDosFromDataSources();
    }

    public String addMyToDo(ToDo toDo) {
        boolean insertionStatus = toDoDao.saveToDo(toDo);
        if(insertionStatus){
            return "ToDo Added Successfully Thank You !!!!";
        }else{
            return "Failed ToDo not Added !!!";
        }
    }

    public ToDo getToDoByID(String id) {
        List<ToDo>toDOListRightNow = toDoDao.getToDosFromDataSources();
        for(ToDo toDo : toDOListRightNow){
            if(toDo.getID().equals(id)){
                return toDo;
            }
        }
        return null;
    }
}
