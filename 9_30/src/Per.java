import java.io.*;

/**
 * @author 22044133 左立志
 * @data 2024/9/30 14:13
 */
public class Per {
    public static void main(String[] args) throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\123.txt"));
        int len;
        //byte[] bytes=new byte[1024];
        while((len=inputStreamReader.read())!=-1){
            System.out.println((char)len);
        }
    }
}
