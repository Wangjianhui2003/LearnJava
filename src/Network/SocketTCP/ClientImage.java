//发送图片的客户端
package Network.SocketTCP;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class ClientImage {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);//连接
        System.out.println("connected,start to transit file...");

        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\Network\\LinaImage.jpg";//创建文件流
        BufferedInputStream file = new BufferedInputStream(new FileInputStream(filePath));
        BufferedOutputStream output = new BufferedOutputStream(socket.getOutputStream());

        byte[] buf = new byte[1024];//读文件并发送
        int readLen;

        while((readLen = file.read(buf)) != -1){
            output.write(buf,0,readLen);
        }
        System.out.println("Image transition finished");

        socket.shutdownOutput();//标记关闭输入

        file.close();
        output.close();
        socket.close();
    }
}
