//UDP receiver then send
package Network.SocketUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);//建socket
        System.out.println("waiting for package...");

        byte[] buf = new byte[1024];//阻塞等待数据报
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        socket.receive(packet);

        int length = packet.getLength();//处理
        byte[] data = packet.getData();
        String s = new String(data,0,length);
        System.out.println(s);

        byte[] data1 = "hi".getBytes();//发送数据
        DatagramPacket datagramPacket = new DatagramPacket(data1, data1.length, InetAddress.getByName("192.168.92.1"),9998);
        socket.send(datagramPacket);

        socket.close();
    }
}
