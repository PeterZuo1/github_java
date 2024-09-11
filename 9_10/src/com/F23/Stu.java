package com.F23;

public class Stu {
    private String sno;
    private String name;
    private int grades;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
    public  void set(String sno,String name,int grades){
        this.sno = sno;
        this.name = name;
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "sno='" + sno + '\'' +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
