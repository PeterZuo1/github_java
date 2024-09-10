package com.F2;

import java.io.Console;

public class Pai {
    public Pai(int[] a){
        sort(a);
        for(int v:a)
            System.out.println(v);
    }
    public Pai(String str){
        char[] str1=str.toCharArray();
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            System.out.print(str1[i]);
        }
    }
    private void sort(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int x=a[j];
                    a[j]=a[j+1];
                    a[j+1]=x;
                }
            }
        }
    }
}
