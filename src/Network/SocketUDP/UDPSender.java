//UDP sender
package Network.SocketUDP;

import java.io.IOException;
import java.net.*;

public class UDPSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] data = "hello".getBytes();//发送数据
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.92.1"),9999);
        socket.send(datagramPacket);

        byte[] buf = new byte[1024];//接收数据
        DatagramPacket datagramPacket1 = new DatagramPacket(buf,buf.length);
        socket.receive(datagramPacket1);

        byte[] data1 = datagramPacket1.getData();//处理数据
        int length = datagramPacket1.getLength();
        System.out.println(new String(data1,0,length));

        socket.close();
    }
}
