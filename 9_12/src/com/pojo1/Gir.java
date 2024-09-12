package com.pojo1;

public class Gir extends Demo1 {
    @Override
    public void girth1(int r) {
        double a=2*Math.PI*r;
        System.out.printf("%.2f",a);
    }

    @Override
    public void girth1(int x, int y) {
        int s=2*(x+y);
        System.out.println(s);
    }
}
