package com.saurav.ToDoApp.repository;
import com.saurav.ToDoApp.service.model.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ToDoDao {
    private List<ToDo> toDoList;
    public ToDoDao(){
        toDoList = new ArrayList<>();
        toDoList.add(new ToDo("001","Testing",true));
    }

    public List<ToDo> getToDosFromDataSources() {
        return toDoList;
    }

    public boolean saveToDo(ToDo toDo) {
        toDoList.add(toDo);
        return true;
    }
}
