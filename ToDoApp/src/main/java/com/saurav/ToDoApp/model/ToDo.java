package com.saurav.ToDoApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ToDo {
    private String ID;
//    @JsonProperty("toDo_name")
    private String toDoName;
    private Boolean status;

    public ToDo(String ID, String toDoName, Boolean status) {
        this.ID = ID;
        this.toDoName = toDoName;
        this.status = status;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }
    public void setToDoName(String toDoName) {
        this.toDoName = toDoName;
    }
    public String getToDoName() {
        return toDoName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
