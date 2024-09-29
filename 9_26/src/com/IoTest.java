package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 22044133 左立志
 * @data 2024/9/26 9:05
 */
public class IoTest {
    public static void main(String[] args) throws IOException {
/*        char c;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');*/
        File field=new File("D:/java/9_26/Zuo");
        //boolean b = io(field);
        //field.delete();
        //System.out.println(b);
        System.out.println(io1(field));
    }

/*    public static boolean io(File file)
    {
        File[] files=file.listFiles();
        for(File l:files)
        {
            if(l.isDirectory())
            {
                io(l);
            }
            if(l.isFile()&&l.getName().endsWith(".txt"));
            {
                return true;
            }
        }
        return false;
    }*/

    public static void io(File file)
    {
        file.delete();
    }
    public static int io1(File file)
    {
        int a=0;
        File[] files = file.listFiles();
        for(File file1:files)
        {
            if(file1.isFile())
            {
                a++;
            }
            else
            {
                io(file1);
            }
        }
        return a;
    }
    public void Count(File file)
    {
        Map<String,Integer> map=new HashMap<>();
        File[] files = file.listFiles();
        for(File f:files)
        {
            if(f.isFile()) {
                if (f.getName().endsWith(".txt")) {
                    if (!map.containsKey("txt")) {
                        map.put("txt", 1);
                    } else {
                        map.put("txt", map.get("txt") + 1);
                    }
                }
                else if(f.getName().endsWith(".xlsx")) {
                    if (!map.containsKey("xlsx")) {
                        map.put("xlsx", 1);
                    } else {
                        map.put("xlsx", map.get("xlsx") + 1);
                    }
                }
                else if(f.getName().endsWith(".rtf")) {
                    if (!map.containsKey("rtf")) {
                        map.put("rtf", 1);
                    } else {
                        map.put("rtf", map.get("rtf") + 1);
                    }
                }
                else if(f.getName().endsWith(".bmp")) {
                    if (!map.containsKey("bmp")) {
                        map.put("bmp", 1);
                    } else {
                        map.put("bmp", map.get("bmp") + 1);
                    }
                }
            }
            else {
                Count(f);
            }

        }
        for(String a:map.keySet())
        {
            System.out.println(a+"  "+map.get(a));
        }
    }
}
