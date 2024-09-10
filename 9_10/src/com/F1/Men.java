package com.F1;

public class Men extends JuMin{
    String study;//学历
    String pro;//职业
    public Men(String number,String name,String age,String study,String pro){
        super(number,name,age);
        this.study=study;
        this.pro=pro;
    }

    @Override
    public String toString() {
        return "Men{" +
                "study='" + study + '\'' +
                ", pro='" + pro + '\'' +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
