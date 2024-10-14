import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 22044133 左立志
 * @data 2024/10/14 14:45
 */
public class Dome4 {
    public static void main(String[] args) throws IOException {
        ServerSocket so = new ServerSocket(12345);
        Scanner scanner = new Scanner(System.in);
        while (true){
            Socket accept = so.accept();
            InputStream inputStream = accept.getInputStream();
            int a;
            System.out.println("服务端输出");
            while((a=inputStream.read())!=-1){
                System.out.print((char)a);
                System.out.println("输入消息");
                String s=scanner.next();
                OutputStream outputStream = accept.getOutputStream();
                outputStream.write(s.getBytes());
                outputStream.close();
            }
            //Socket socket = new Socket("127,0,0,1",1234);
        }

    }
}
