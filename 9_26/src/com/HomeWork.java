package com;

import java.io.File;
import java.lang.reflect.Method;

/**
 * @author 22044133 左立志
 * @data 2024/9/26 12:07
 */
public class HomeWork {
    public static void main(String[] args) throws ClassNotFoundException {
        File file = new File("C:\\Users\\Administrator\\Desktop");
//        Class clazz=Class.forName("IoTest");
//        Method declaredMethod = clazz.getDeclaredMethods(File.class);
        IoTest ioTest = new IoTest();
        ioTest.Count(file);
    }

}
