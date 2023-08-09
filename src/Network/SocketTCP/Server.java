//SocketTCP server端
package Network.SocketTCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);//监听9999,阻塞
        System.out.println("监听...");

        Socket socket = serverSocket.accept();//返回一个接收的socket

        InputStream inputStream = socket.getInputStream();//创建一个输入流
        byte[] buf = new byte[1024];
        int readLen;
        while((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readLen));
        }

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Server:hello client".getBytes());
        socket.shutdownOutput();//重点,关闭输入

        inputStream.close();//关闭
        outputStream.close();
        socket.close();
        serverSocket.close();//多一步骤
    }
}
