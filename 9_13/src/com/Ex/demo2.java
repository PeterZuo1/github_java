package com.Ex;

public class demo2 {
    public static void main(String[] args) {
        int a=3,b=0;
        if(b==0)
        {
            throw new RuntimeException("除数为零");
        }
        System.out.println(a/b);
    }
}
