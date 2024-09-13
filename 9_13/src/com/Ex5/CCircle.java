package com.Ex5;

public class CCircle {
    public double mian(int r) throws ExceptionM
    {
        if(r<0)
        {
            throw new ExceptionM("面积为负");
        }
        System.out.println("面积为负");
        return Math.PI*r*r;
    }
}
