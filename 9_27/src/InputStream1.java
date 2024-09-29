import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 22044133 左立志
 * @data 2024/9/27 11:15
 */
public class InputStream1 {
    public static void main(String[] args) throws IOException {
        FileInputStream f1 = new FileInputStream("C:\\Users\\Administrator\\Desktop\\AA\\123\\1.jpg");
         int a;//读取一个
        byte[] byt=new byte[1024];
        FileOutputStream f2 = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\AA\\123\\2.txt");
        while((a=f1.read(byt))!=-1)
        {
            f2.write(byt,0,a);
        }
//        while ((a=f1.read(byt))!=-1){
//            System.out.println(a);
//            System.out.print(new String(byt));
//        }
        f1.close();
    }
}
