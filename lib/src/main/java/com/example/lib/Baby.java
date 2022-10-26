package com.example.lib;

public class Baby {
    private String name;
    private int age;
    private int height;

     Baby(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getHeight(){
        return height;
    }
}