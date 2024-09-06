import java.util.Arrays;

public class text {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,6};
//        int sum=0;
//        int min=a[0],max=a[0];
//        int i;
//        for( i=0;i<a.length;i++)
//        {
//            if(a[i]<min)
//                min=a[i];
//            if(a[i]>max)
//                max=a[i];
//            sum+=a[i];
//        }
//        double x=(double)sum/i;
//        System.out.println("最大"+max+"最小"+min);
//        System.out.println("总和"+sum+"平均"+x);

        int[] a={3,4,5,2,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int s=Arrays.binarySearch(a,5);
        System.out.println(s);
    }
}
