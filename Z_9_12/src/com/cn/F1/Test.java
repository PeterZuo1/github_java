package com.cn.F1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int age=scanner.nextInt();
        Teacher teacher=new Teacher();
        teacher.setAge(age);
        teacher.setName(name);
        teacher.MyName();
    }
}
