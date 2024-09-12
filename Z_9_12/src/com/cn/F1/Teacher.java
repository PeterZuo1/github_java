package com.cn.F1;

public class Teacher {
    private String name;
    private int age;
    private String degree;
    private String job;
    public void MyName()
    {
        System.out.println(name+age+degree+job);
        System.out.println("我是个好人");
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
