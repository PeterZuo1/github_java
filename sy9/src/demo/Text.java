package demo;

import java.util.Scanner;
import pojo.*;
public class Text {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("1.������");
        System.out.println("2.���⳵");
        Bus b=new Bus();//������
        Taxi c=new Taxi();//���⳵
        int a= sca.nextInt();
        if(a==1){
            System.out.println("������ʻ·��");
            double a1= sca.nextDouble();
            System.out.println("��������ʻ"+b.drive_distance(a1)+"����"+"����Ϊ"+b.total(a1)+"Ԫ");
        }
        if(a==2){
            System.out.println("������ʻ·��");
            double a2= sca.nextDouble();
            System.out.println("��������ʻ"+c.drive_distance(a2)+"����"+"����Ϊ"+c.total(a2)+"Ԫ");
        }
    }
}
