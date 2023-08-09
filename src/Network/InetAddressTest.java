//InetAddress类和方法
package Network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress host1 = InetAddress.getByName("LAPTOP-TI358MN1");
        System.out.println(host1);

        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        String hostAddress = host2.getHostAddress();
        System.out.println(hostAddress);

        String hostname = host2.getHostName();
        System.out.println(hostname);
    }
}
