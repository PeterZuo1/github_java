package com.cn;

/**
 * @author 22044133 左立志
 * @data 2024/10/8 9:15
 */
public class Test1 {
    public static void main(String[] args){
//        THreadTest tHreadTest = new THreadTest();
//        THreadTest tHreadTest1 = new THreadTest();
//        tHreadTest.start();
//        tHreadTest1.start();
        Runable1 runable1 = new Runable1();
        Thread thread1 = new Thread(runable1,"1");
        Thread thread2 = new Thread(runable1,"2");
        thread1.start();
        thread2.start();
    }
}
