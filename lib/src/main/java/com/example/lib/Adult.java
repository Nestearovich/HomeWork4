package com.example.lib;

public class Adult {
    private String name;
    private int age;
    private int height;
    private String str;

    Adult(String name, int age, int height){
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
    public String getStr(){return "The child has grow up";}
}
