import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author 22044133 左立志
 * @data 2024/10/11 11:28
 */
public class reviceData {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(12345);
        while (true){
            byte[] b=new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(b,b.length);
            if(datagramPacket.equals("886"))
            {
                break;
            }
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        }

    }
}
