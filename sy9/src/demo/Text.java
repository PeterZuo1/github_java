package demo;

import java.util.Scanner;
import pojo.*;
public class Text {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("1.公交车");
        System.out.println("2.出租车");
        Bus b=new Bus();//公交车
        Taxi c=new Taxi();//出租车
        int a= sca.nextInt();
        if(a==1){
            System.out.println("输入行驶路程");
            double a1= sca.nextDouble();
            System.out.println("公交车行驶"+b.drive_distance(a1)+"公里"+"车费为"+b.total(a1)+"元");
        }
        if(a==2){
            System.out.println("输入行驶路程");
            double a2= sca.nextDouble();
            System.out.println("公交车行驶"+c.drive_distance(a2)+"公里"+"车费为"+c.total(a2)+"元");
        }
    }
}
