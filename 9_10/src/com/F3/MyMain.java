package com.F3;

public class MyMain {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.name="张三";//全局
        //myClass.age=11;//私有属性
        myClass.sex="男";//同一包下访问
        System.out.println(myClass.GetSex());
        System.out.println(myClass.GetAge());
        //System.out.println(myClass.GetName());

    }
}
