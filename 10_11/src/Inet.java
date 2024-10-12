import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 22044133 左立志
 * @data 2024/10/11 9:29
 */
public class Inet {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address=InetAddress.getByName("192.168.32.44");
        String name=address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(name);
        System.out.println(hostAddress);

    }
}
