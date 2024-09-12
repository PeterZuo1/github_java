package com.pojo1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Gir gir=new Gir();
        System.out.println("输入半径");
        Scanner scanner=new Scanner(System.in);
        int r=scanner.nextInt();
        System.out.println("圆周长");
        gir.girth1(r);
        System.out.println("输入长宽");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println("长方形");
        gir.girth1(x,y);
    }
}
