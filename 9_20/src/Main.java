import pojo.Course;
import pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 22044133 左立志
 * @data 2024/9/20 11:54
 */
public class Main {
    public static void main(String[] args) {

        List<Student> list=new ArrayList<Student>();
        List<Course> list1=new ArrayList<Course>();
        //Student student=new Student();
        //Course course=new Course();
        int M=0;//选课
        String[] Sx=new String[10];
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
                    System.out.println("0.退出");
                    int a1=scanner.nextInt();
                    if(a1==1) {//增加
                        System.out.println("输入id：");
                        int s1=scanner.nextInt();
                        System.out.println("输入姓名：");
                        String s2=scanner.next();
                        System.out.println("输入年龄：");
                        int s3=scanner.nextInt();
                        Student student=new Student();
                        int flag=1;
                        for(int i=0;i<list.size();i++)
                        {
                            if(list.get(i).getId()==s1)
                            {
                                flag=0;
                            }
                        }
                        if(flag!=0){
                            student.setId(s1);//赋值
                            student.setSname(s2);
                            student.setAge(s3);
                            list.add(student);
                        }
                        else
                        {
                            System.out.println("输入id重复，添加失败");
                        }
//                        Iterator<Student> It=list.iterator();
//                        while(It.hasNext())
//                        {
//                            System.out.println(It.next());
//                        }
                        //System.out.println(list);
                        break;
                    }//增加
                    else if(a1==2){//删除
                        System.out.println("输入删除id");
                        int de1=scanner.nextInt();
                        for(int i=0;i<list.size();i++)
                        {
                            if(list.get(i).getId()==de1)
                            {
                                list.remove(i);
                                System.out.println("删除成功");
                            }
                        }
                        break;
                    }//删除
                    else if(a1==3){//修改
                        System.out.println("输入修改信息学生id");
                        int x=scanner.nextInt();
                        System.out.println("选择修改内容");
                        System.out.println("1.姓名");
                        System.out.println("2.年龄");
                        int x1=scanner.nextInt();
                        if(x1==1)
                        {
                            System.out.println("输入新的姓名");
                            String S1=scanner.next();
                            for(int i=0;i<list.size();i++)
                            {
                                if(list.get(i).getId()==x)
                                {
                                    list.get(i).setSname(S1);
                                    System.out.println("修改成功");
                                }
                            }
                        }
                        else if(x1==2)
                        {
                            System.out.println("输入新的年龄");
                            int S1=scanner.nextInt();
                            for(int i=0;i<list.size();i++)
                            {
                                if(list.get(i).getId()==x)
                                {
                                    list.get(i).setAge(S1);
                                    System.out.println("修改成功");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("输入错误");
                        }
                        break;


                    }//修改
                    else if(a1==0){
                        break;
                    }
                    else{
                        System.out.println("输入错误");
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
                        Course course=new Course();
                        System.out.println("输入id：");
                        int s1=scanner.nextInt();
                        System.out.println("输入课程名：");
                        String s2=scanner.next();
                        int flag1=1;
                        for(int i=0;i<list1.size();i++)
                        {
                            if(list1.get(i).getId()==s1)
                            {
                                flag1=0;
                            }
                        }
                        if(flag1!=0)
                        {
                            course.setId(s1);//赋值
                            course.setCname(s2);
                            list1.add(course);
                            System.out.println(list1);
                        }
                        else
                        {
                            System.out.println("输入id重复，添加失败");
                        }
                        break;
                    }//增加
                    else if(a2==2){
                        System.out.println("输入删除id");
                        int de2=scanner.nextInt();
                        for(int i=0;i<list1.size();i++)
                        {
                            if(list1.get(i).getId()==de2)
                            {
                                list1.remove(i);
                                System.out.println("删除成功");
                            }
                        }
                        break;
                    }//删除
                    else if(a2==3){
                        System.out.println("输入需要修改的课程id");
                        int co=scanner.nextInt();
                        for(int i=0;i<list1.size();i++){
                            System.out.println("输入新的课程名");
                            String c=scanner.next();
                            if(list1.get(i).getId()==co)
                            {
                                list1.get(i).setCname(c);
                                System.out.println("修改成功");
                                break;
                            }
                            else{
                                System.out.println("输入错误");
                            }
                        }
                        break;
                    }//修改
                    else if(a2==4){
                        System.out.println("输入查找课程id");
                        int s1=scanner.nextInt();
                        for(int i=0;i<list1.size();i++){
                            if(list1.get(i).getId()==s1)
                            {
                                System.out.println(list1.get(i));
                            }
                        }
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
                    System.out.println("输入选课学生id");
                    int a3=scanner.nextInt();//获取id
                    System.out.println(list1);
                    System.out.println("输入选择课程名");
                    String ss=scanner.next();
                    Sx[M]=ss;
                    M++;
                    for(int i=0;i<list.size();i++)
                    {
                        if(list.get(i).getId()==a3)
                        {
                            list.get(i).setXcourse(Sx);
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("输入查询学生id");
                    int a4=scanner.nextInt();
                    for(int i=0;i<list.size();i++)
                    {
                        if(list.get(i).getId()==a4)
                        {
                            System.out.println(list.get(i).toString());
                        }
                        else
                        {
                            System.out.println("id输入错误");
                        }
                    }
                    break;
                }
            }
            if(a==0)
                break;
        }
        System.out.println("结束");
    }
}
