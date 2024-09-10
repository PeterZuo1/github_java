package com.F1;

public class Off extends Men{
    String dang;//党派
    String post;//职务
    public Off(String number,String name,String age,String study,String pro,String dang,String post)
    {
        super(number, name, age, study, pro);
        this.dang=dang;
        this.post=post;
    }

    @Override
    public String toString() {
        return "Off{" +
                "dang='" + dang + '\'' +
                ", post='" + post + '\'' +
                ", study='" + study + '\'' +
                ", pro='" + pro + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
