package com.saurav.SpringAnnotation;

public class Student {
    private String name;

    public Student(){
        System.out.println("called by default");
    }
    public Student(String name){
        this.name = name;
        System.out.println("Student calling from spring framework "+this.name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
