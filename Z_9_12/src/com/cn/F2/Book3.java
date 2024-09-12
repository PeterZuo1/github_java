package com.cn.F2;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Book3 {
    private String title;
    private String pageNum;
    private String type;
    public void detail()
    {
        System.out.println(title+" "+pageNum+"  "+type);
    }
    public Book3(String title,String pageNum){
        this.title=title;
        this.pageNum=pageNum;
        this.type="计算机";
    }
    public Book3(String title,String pageNum,String type){
        this.title=title;
        this.pageNum=pageNum;
        this.type=type;
    }
}
