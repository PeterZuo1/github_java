package com.cn.F3;

public class Employee extends Person {
    private String office;
    private double wage;
    private String hiredate;
    public Employee(){

    }
    public String shuchu()
    {
        return getName()+getAddress()+getEmail()+getTelphone()+office+wage+hiredate;
    }
}
