package com.Ex;

public class demo1 {
    public static void main(String[] args) {
        int[] a={1,2,3};
        try{
            int b=a[3];
        }
        catch (Exception e)
        {
            System.out.println("index out of bound!");
        }
    }
}
