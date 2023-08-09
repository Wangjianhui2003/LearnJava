//SocketTCP client端
package Network.SocketTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //连接主机的9999端口,得到一个socket
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("连接成功 " + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();//开始传输
        outputStream.write("Client:hello,server".getBytes());
        socket.shutdownOutput();//标记关闭输入

        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        outputStream.close();//关闭
        inputStream.close();
        socket.close();
    }
}
