package com;

import java.util.Scanner;
import java.lang.String;
public class Homework {
    public static void main(String[] args) {
//        1.判断输入的字符串是否是 .java 结束 
//        public boolean endsWith(String suffix) （查帮助，查此方法的说明）

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("输入字符串");
//        String str=scanner.next();
//        if(str.endsWith(".java")){
//            System.out.println("正确");
//        }
//        else
//        {
//            System.out.println("错误");
//        }

//        2. 输出“北京欢迎你”中“欢迎”是第几位。 public int indexOf(String str) （查帮助，查此方法的说明） 

//        String str="北京欢迎你";
//        System.out.println(str.indexOf("欢迎"));


//        3. 把输入的小写字母改成大写字母输出。 

//            Scanner scanner=new Scanner(System.in);
//            String str=scanner.next();
//            System.out.println(str.toUpperCase());

        //4. “那车水马龙的人世间，那样地来 那样地去，太匆忙”最后一次出现“那”的位置。
//        String str="那车水马龙的人世间，那样地来 那样地去，太匆忙";
//        System.out.println(str.lastIndexOf("那"));


//        5. “美丽呀 倒影在心房 美丽呀 泪珠挂腮上  美丽呀 花儿吐芬芳 美丽呀 你让我慌张”
//        把这个字符串所有“美丽”替换成“倒霉”。

//        String str="美丽呀 倒影在心房 美丽呀 泪珠挂腮上  美丽呀 花儿吐芬芳 美丽呀 你让我慌张";
//        System.out.println(str.replace("美丽","倒霉"));

//        6. "白 毕 卞 蔡 曹 岑 常 车 陈 成 程 池 邓 丁 
//        范 方 樊 费 冯 符 傅 甘 高 葛 龚  古 关 郭 韩"
//        把这个字符串以空格为分隔，
//        分到字符串数组中，
//        再输出。然后再以”_”为分隔符，连接成一个字符中 


//        String str="白 毕 卞 蔡 曹 岑 常 车 陈 成 程 池 邓 丁 范 方 樊 费 冯 符 傅 甘 高 葛 龚 古 关 郭 韩";
//        char[] str1=str.toCharArray();
//        for(char a:str1)
//            System.out.print(a);
//        System.out.println();
//        System.out.println(str.replaceAll(" ","_"));

        //7.去掉字符串右边的空格
//        String str="zuo  ";
//        System.out.println(str.trim());


        //8.将s所指字符串的正序和反序进行连接,例如 "ok"->"okko"


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("输入字符");
//        String str=scanner.next();
//        StringBuffer stringBuffer=new StringBuffer(str);
//        System.out.println(str+stringBuffer.reverse());



//        9.字符串右移n位,例如   "hello world" 右移两位 后ldhello wor
//                要求写一个方法实现此功能,方法的格式是
//        String moveToRight(String str,int p)
//        str:需要移动的字符串
//        p:右移的位数


//        String str="hello world";
//        System.out.println(moveToRight(str,3));


        //10.求5个字符串中最长的那个，把最长的字符串打印出来


//        String str1="aaa,aaaaa,a,cccc,xxxxxxxxx";
//        String[] arr=str1.split(",");
//        int max=0;
//        int j=0;
//        for(int i=0;i<arr.length;i++)
//        {
//            if(arr[i].length()>max){
//                max=arr[i].length();
//                j=i;
//            }
//        }
//        System.out.println(arr[j]);


        //11.若可以从一个源字符串中， 找到一个相符的字符串， 则返回第一个字符的索引位置，否则返回-1。

        String str="zuolizhi";
        System.out.println(str.indexOf("zuo"));

    }


    //9.方法
//    public static String moveToRight(String str,int p){
//        StringBuffer stringBuffer=new StringBuffer(str);
//        String str1=str.substring(str.length()-p,str.length());
//        return str1+stringBuffer.delete(str.length()-p,str.length());
//    }


}
