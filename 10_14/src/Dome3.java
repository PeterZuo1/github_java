import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 22044133 左立志
 * @data 2024/10/14 14:32
 */
public class Dome3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1",12345);
        while (true){
            OutputStream outputStream = socket.getOutputStream();//
            System.out.println("输入消息");
            String s=scanner.next();
            outputStream.write(s.getBytes());
            System.out.println("客户端输出");
            InputStream inputStream = socket.getInputStream();
            int a;
            while ((a=inputStream.read())!=-1)
                System.out.println((char)a);
        }
        //inputStream.close();

    }
}
