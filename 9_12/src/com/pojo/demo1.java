package com.pojo;

public class demo1 {
    private String name;
    private int age;
    public demo1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public demo1()
    {

    }
    public void showInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
