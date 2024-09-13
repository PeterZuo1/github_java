package com.Ex5;

public class Test {
    public static void main(String[] args) {
        CCircle cCircle=new CCircle();
        try{
            cCircle.mian(-2);
        }
        catch (ExceptionM e)
        {
            System.out.println("异常");
        }
    }
}
