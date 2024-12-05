import Dao.CsDao;
import Impl.CsDaoImpl;
import pojo.Course;
import pojo.Student;
import util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 22044133 左立志
 * @data 2024/9/20 11:54
 */
public class Main {
    public static void main(String[] args) {

        while(true)
        {
            System.out.println("----------菜单-------------");
            System.out.println("-------1.学生信息增删改----");
            System.out.println("-------2.课程信息增删改查--");
            System.out.println("-------3.学生选课----------");
            System.out.println("-------4.查看学生信息------");
            System.out.println("-------0.退出--------------");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            switch (a)
            {
                case 1:{
                    System.out.println("1.学生信息增加");
                    System.out.println("2.学生信息删除");
                    System.out.println("3.学生信息修改");
                    System.out.println("4.所有学生信息");
                    System.out.println("0.退出");
                    int a1=scanner.nextInt();
                    if(a1==1) {//增加
                        System.out.println("输入学号:");
                        String s1=scanner.next();
                        System.out.println("输入姓名：");
                        String s2=scanner.next();
                        System.out.println("输入性别：");
                        String s3=scanner.next();
                        Student student = new Student(s1,s2,s3);
                        if(Addutil.addSelect(student)){
                            System.out.println("添加成功");
                        }
                        else{
                            System.out.println("添加失败");
                        }
                        break;
                    }//增加
                    else if(a1==2){//删除
                        System.out.println("输入删除学号");
                        String de=scanner.next();
                        Student student = new Student();
                        student.setSno(de);
                        if(Deleteutil.Delete(student)){
                            System.out.println("删除成功");
                        }
                        else{
                            System.out.println("删除失败");
                        }
                        break;
                    }//删除
                    else if(a1==3){//修改
                        System.out.println("输入修改信息学生学号");
                        String sno=scanner.next();
                        System.out.println("1.新姓名");
                        String name=scanner.next();
                        System.out.println("2.新性别");
                        String sex=scanner.next();
                        Student student = new Student(sno, name, sex);
                        if(Updeteutil.update(student))
                        {
                            System.out.println("修改成功");
                        }
                        else{
                            System.out.println("修改失败");
                        }
                        break;


                    }//修改
                    else if(a1==4)
                    {
                        Student student = new Student();
                        Class c = student.getClass();
                        List list = SelectAllutil.selectAll(c);
                        System.out.println(list);
                        break;
                    }
                    else if(a1==0){
                        break;
                    }
                }
                case 2:{
                    System.out.println("1.课程信息增加");
                    System.out.println("2.课程信息删除");
                    System.out.println("3.课程信息修改");
                    System.out.println("4.课程信息查找");
                    System.out.println("0.退出");
                    int a2=scanner.nextInt();
                    if(a2==1) {
                        System.out.println("输入课号：");
                        String s1=scanner.next();
                        System.out.println("输入课程名：");
                        String s2=scanner.next();
                        System.out.println("输入教师号：");
                        String s3=scanner.next();
                        Course course=new Course(s1,s2,s3);
                        if(Addutil.addSelect(course))
                            System.out.println("添加成功");
                        else
                            System.out.println("添加失败");
                        break;
                    }//增加
                    else if(a2==2){
                        System.out.println("输入删除课程号");
                        String de2=scanner.next();
                        Course course = new Course();
                        course.setCno(de2);
                        if(Deleteutil.Delete(course)){
                            System.out.println("删除成功");
                        }
                        else
                            System.out.println("删除失败");
                        break;
                    }//删除
                    else if(a2==3){
                        System.out.println("输入需要修改的课程号");
                        String co=scanner.next();
                        System.out.println("输入新课程名");
                        String co1=scanner.next();
                        System.out.println("输入新教师号");
                        String co2=scanner.next();
                        Course course = new Course(co, co1, co2);
                        if(Updeteutil.update(course))
                        {
                            System.out.println("修改成功");
                        }
                        else{
                            System.out.println("修改失败");
                        }
                        break;
                    }//修改
                    else if(a2==4){
                        System.out.println("输入查找课程课程号");
                        String s1=scanner.next();
                        Course course = new Course();
                        course.setCno(s1);
                        List list = Selectutil.select(course);
                        System.out.println(list);
                        break;
                    }
                    else if(a2==0){
                        break;
                    }
                    else{
                        System.out.println("输入错误");
                        break;
                    }
                }
                case 3:{
                    System.out.println("输入选课学生学号");
                    String sno=scanner.next();//获取id
                    System.out.println("输入选择课程号");
                    String cno=scanner.next();
                    CsDao csDao = new CsDaoImpl();
                    if(csDao.choose(sno,cno)){
                        System.out.println("添加成功");
                    }
                    else
                        System.out.println("添加失败");
                    break;
                }
                case 4:{
                    System.out.println("输入查询学生学号");
                    String a4=scanner.next();
                    CsDao cs = new CsDaoImpl();
                    cs.selectSno(a4);
                    break;
                }
            }
            if(a==0)
                break;
        }
        System.out.println("结束");
    }
}
