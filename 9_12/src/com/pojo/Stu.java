package com.pojo;

public class Stu extends demo1 {
    private String sex;
    public Stu(String name,int age,String sex)
    {
        super(name,age);
        this.sex=sex;
    }
    public void showInfo(){
        super.showInfo();
        System.out.println(sex);
    }
}
