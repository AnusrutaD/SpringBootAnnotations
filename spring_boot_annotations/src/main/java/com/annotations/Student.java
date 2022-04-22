package com.annotations;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void studying(){
        System.out.println(this.name + " studying");
    }
}
