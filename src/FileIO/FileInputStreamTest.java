//FileInputStream
package FileIO;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {

    }
    @Test
    public void readFile() throws IOException {
        String filepath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText.txt";
        int readData;
        FileInputStream fileInputStream = new FileInputStream(filepath);
        while((readData = fileInputStream.read()) != -1){
            System.out.print((char)readData);
        }
        fileInputStream.close();
        System.out.println("done");
    }
    @Test
    public void readFile2() throws IOException {
        String filepath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText.txt";
        FileInputStream fileInputStream = new FileInputStream(filepath);

        int readLen;
        byte[] buf = new byte[3];//一次最多读3个字节

        while((readLen = fileInputStream.read(buf)) != -1){//不同
            System.out.print(new String(buf,0,readLen));//字节数组显示
        }
        fileInputStream.close();
        System.out.println("done");
    }
}
