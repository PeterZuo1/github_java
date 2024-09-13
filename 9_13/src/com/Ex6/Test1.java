package com.Ex6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int[] a=new int[5];
        try{
            Scanner scanner=new Scanner(System.in);
            for(int i=0;i<5;i++)
            {
                a[i]=scanner.nextInt();
            }
        }
        catch (InputMismatchException e)
        {

            System.out.println("请输入整数");

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("请输入至少五位");
        }
    }
}
