import java.util.Scanner;

public class study {
    public static void main(String[] args) {


//        int[] b={1,2,3,4,5};
        //1.反向输出
//        for(int i=b.length-1;i>=0;i--)
//        {
//            System.out.print(b[i]+" ");
//        }
//2.下标赋值
//        for(int i=0;i<a.length;i++)
//        {
//            a[i]=i;
//        }
//        for(int c:a)
//            System.out.print(c+" ");


        //3.数组最大值
//        int[] x={2,3,4,5,1,6,7,8,9,10};
//        int max=x[0];
//        int count=0;
//        for(int i=0;i<x.length;i++)
//        {
//            if(max<x[i])
//            {
//                max=x[i];
//                count=i;
//            }
//        }
//        System.out.println("最大值"+ max+"下标为"+count);

        //4.数组去0
//        int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//        int[] newArr=new int[20];
//        int j=0;
//        for(int i=0;i<oldArr.length;i++)
//        {
//            if(oldArr[i]!=0)
//            {
//                newArr[j]=oldArr[i];
//                j++;
//            }
//        }
//        for(int i=0;i<j;i++)
//        {
//            System.out.print(newArr[i]+" ");
//        }

//5.输入数组
        int[] a=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数组");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println("输入插入元素");
        int s=scanner.nextInt();
        System.out.println("输入插入的位置");
        int b=scanner.nextInt();
        int[] a1=new int[11];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(j+1==b)
            {
                a1[j]=s;
                j++;
                i--;
                continue;
            }
            a1[j]=a[i];
            j++;
        }
        for(int v:a1)
        {
            System.out.print(v+" ");
        }
        System.out.println();
        System.out.println("输入删除第几个元素");
        int del=scanner.nextInt();
        for(int i=0;i<a1.length-1;i++)
        {
            if(i==del-1){
                while(i<a1.length-1){
                    a1[i]=a1[i+1];
                    i++;
                }
            }
        }
        for(int i=0;i<a1.length-1;i++)
        {
            System.out.println(a1[i]+" ");
        }

   }
}
