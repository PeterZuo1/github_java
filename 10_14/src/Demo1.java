import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author 22044133 左立志
 * @data 2024/10/14 13:54
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] bytes="abc".getBytes();
        InetAddress address=InetAddress.getByName("192.168.32.45");
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,address,12345);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
