package com.F1;

public class JuMin {
    String number;//身份证
    String name;//姓名
    String age;//出生日期
    public JuMin(String number,String name,String age)
    {
        this.number=number;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "JuMin{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
