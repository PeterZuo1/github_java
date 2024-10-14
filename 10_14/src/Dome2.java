import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

/**
 * @author 22044133 左立志
 * @data 2024/10/14 13:54
 */
public class Dome2 {
    public static void main(String[] args)throws IOException {
        MulticastSocket mu = new MulticastSocket(12345);
        DatagramPacket da = new DatagramPacket(new byte[1024],1024);//接收数据
        mu.receive(da);
        byte[] bytes=da.getData();
        System.out.println(new String(bytes));
        mu.close();
    }
}
