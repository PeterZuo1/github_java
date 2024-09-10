package com.F1;

public class Test {
    public static void main(String[] args) {
        JuMin juMin=new JuMin("2020202020202020","张三","2024-7-9");
        Men men=new Men("2020202020202020","张三","2024-7-9","本科","工程师");
        Off off=new Off("2020202020202020","张三","2024-7-9","本科","工程师","党员","老师");
        System.out.println(juMin.toString());
        System.out.println(men.toString());
        System.out.println(off.toString());
    }
}
