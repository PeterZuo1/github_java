package com.cn;

/**
 * @author 22044133 左立志
 * @data 2024/10/8 9:32
 */
public class Runable1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++)
            System.out.println(Thread.currentThread().getName()+":"+i);
    }
}
