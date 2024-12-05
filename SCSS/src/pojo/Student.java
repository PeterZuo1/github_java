package pojo;

import java.util.Arrays;

/**
 * @author 22044133 左立志
 * @data 2024/9/20 11:51
 */
public class Student {
   private String sno;
   private String sname;
   private String ssex;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                '}';
    }

    public Student(String sno, String sname, String ssex) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
    }

    public Student() {
    }
}
