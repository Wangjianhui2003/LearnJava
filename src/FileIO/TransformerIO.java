//转换流 将字节流包装成字符流,指定编码防止乱码
//OutputStreamWriter同理
package FileIO;

import java.io.*;

public class TransformerIO {
    public static void main(String[] args) throws IOException {
        String filepath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\Transformer.txt";
        FileInputStream fileInputStream = new FileInputStream(filepath);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream,"gbk"));
        String s = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }
}
