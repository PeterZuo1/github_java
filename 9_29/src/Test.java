import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author 22044133 左立志
 * @data 2024/9/29 14:59
 */
public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\Administrator\\Desktop\\AA\\abc.txt");
        char[] c=new char[1024];
        int len;
        while((len=fileReader.read(c))!=-1)
        {
            System.out.println(c);
        }
        //String str=new String(c);
        int[] a=new int[10];
        //ArrayList<Integer> a=new ArrayList<>();
//        int cc=c.length;
//        System.out.println(cc);
            int j=0;
//        //fileReader.close();
        char[] b=new char[20];
        for(int i=0;i<c.length;i++)
        {
            if(c[i]>48&&c[i]<=57)
            {
                b[j]=c[i];
                j++;
            }
        }
        int mm=0;
        for(int i=0;i<j;i++)
        {
            if(b[i]!=' '&&b[i]!='0'){
                a[mm]=Character.digit(b[i], 10);
                mm++;
            }
            //System.out.println(b[i]);
        }
        //System.out.println(mm);
        //Arrays.sort(a);
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<mm;i++)
        {
            arr.add(a[i]);
            //System.out.println(a[i]);
        }
        Collections.sort(arr);
        String str = "";
        int k=0;
        for(int i:arr)
        {
            str=str+i;
            if(k<mm-1){
                str=str+"-";
            }
            k++;
        }
        System.out.println(str);
        FileWriter fileWriter = new FileWriter("C:\\Users\\Administrator\\Desktop\\AA\\abc.txt");
        fileWriter.write(str);
        fileWriter.close();
        fileReader.close();
/*
for(char i:c){
//System.out.println(i);
if(i>='0'&&i<='9'){
System.out.println(i);
a[j]=(int)i;
j++;
}
}
for(int a1:a)
{
System.out.println(a1);
}
*/
    }
}
