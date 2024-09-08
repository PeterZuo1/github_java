import java.util.Scanner;

public class java_9_5 {
    public static void main(String[] args) {
        //1.小和尚挑水
//        int a=0;
//        int i;
//        for(i=0;a<80;i++)
//        {
//            a+=5;
//        }
//        System.out.println(i);

//2.奇偶判断
//        Scanner scanner=new Scanner(System.in);
//        int num=scanner.nextInt();
//        if(num%2==-1)
//        {
//            System.out.println("负奇数");
//        }
//        else if(num%2==1)
//            System.out.println("正奇数");
//        else if(num>0&&num%2==0)
//            System.out.println("正偶数");
//        else if(num<0&&num%2==0)
//            System.out.println("负偶数");
//        else
//            System.out.println("0");

        //3.6的阶乘
//        int a=1;
//        for(int i=1;i<=6;i++)
//        {
//            a*=i;
//        }
//        System.out.println(a);

        //4.打印图形
//        for(int i=8;i>=1;i--){
//            for(int j=i;j>=1;j--)
//            {
//                System.out.print("*");
//            }
//            System.out.println();

//5.小球落地
//        double a=100;
//        double sum=100;
//        for(int i=0;i<9;i++)
//        {
//            a/=2;
//            sum=sum+(a*2);
//        }
//        System.out.println(sum+a/2);
//        System.out.println(a/2);

        //6.百鸡问题
//                for (int x = 0; x <= 20; x++) {
//                    for (int y = 0; y <= 33; y++) {
//                        int z = 100 - x - y;
//                        if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
//                            System.out.println("鸡翁个数为：" + x + "鸡母个数为：" + y + "鸡雏个数为：" + z);
//                        }
//                    }
//                }
//7.猴子吃桃
//        int a=0;
//        for(int i=5;i>0;i--)
//        {
//            a=(a+1)*2;
//            int b=a/2+1;
//            System.out.println("第"+i+"天吃了"+b);
//
//        }
//        System.out.println("总数"+a);


        //8.剪绳子
        int a=3000;
        int i=0;
        while(a>=5){
            a/=2;
            i++;
        }
        System.out.println("花费"+i+"天");
    }
}
