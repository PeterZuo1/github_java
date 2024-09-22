package pojo;

import java.util.Arrays;

/**
 * @author 22044133 左立志
 * @data 2024/9/20 11:51
 */
public class Student {
    private int id;
    private String sname;
    private int age;
    private String[] xcourse;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getXcourse() {
        return xcourse;
    }

    public void setXcourse(String[] xcourse) {
        this.xcourse = xcourse;
    }

    public void addCourse(String s)
    {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", 姓名='" + sname + '\'' +
                ", 年龄=" + age +
                ", 课程=" + Arrays.toString(xcourse) +
                '}';
    }
}
