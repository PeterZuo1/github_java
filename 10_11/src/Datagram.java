import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author 22044133 左立志
 * @data 2024/10/11 11:13
 */
public class Datagram {
    public static void main(String[] args)throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            byte[] by= s.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(by,by.length, InetAddress.getByName("127.0.0.1"),12345);
            datagramSocket.send(datagramPacket);
        }
    }
}
