package com.F23;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入存储数量");
        int stu1=scanner.nextInt();
        Stu[] s=new Stu[stu1];
        for(int i=0;i<stu1;i++)
        {
            s[i]=new Stu();
            String s1=scanner.next();
            String s2=scanner.next();
            int s3=scanner.nextInt();
            s[i].set(s1,s2,s3);
            System.out.println(s[i].toString());
        }

    }
}
