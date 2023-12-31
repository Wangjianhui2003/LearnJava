//接收图片的服务端
package Network.SocketTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerImage {
    public static void main(String[] args) throws IOException {
        System.out.println("watching...");//等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("connected start to receive file");

        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\Network\\SocketTCP\\ReceivedFile.jpg";//创建流
        BufferedInputStream input = new BufferedInputStream(socket.getInputStream());//
        BufferedOutputStream file = new BufferedOutputStream(new FileOutputStream(filePath));//

        int readLen;//接收文件并保存
        byte[] buf = new byte[1024];
        while((readLen = input.read(buf)) != -1){
            file.write(buf,0,readLen);
        }
        System.out.println("file received");

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));//
        bufferedWriter.write("server:file received");
        bufferedWriter.flush();//刷新
        socket.shutdownOutput();


        bufferedWriter.close();
        input.close();
        file.close();

        socket.close();
        serverSocket.close();
    }
}
