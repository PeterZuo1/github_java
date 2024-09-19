public class Test1 {
    public static void main(String[] args) {

        //十个随机数不能重复
        int[] a=new int[10];
        for(int i=0;i<10;i++)
        {
            int x=(int)(Math.random()*10);
            a[i]=x;
            if(i!=0)
            {
                for(int j=0;j<i;j++)
                {
                    if(x==a[j])
                    {
                        i--;
                        break;
                    }

                }
            }

        }
        for(int b:a)
        {
            System.out.println(b);
        }
    }
}
