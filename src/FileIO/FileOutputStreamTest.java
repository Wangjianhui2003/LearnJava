//FileOutputStream write .getBytes()
package FileIO;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText2";
        //文件不存在会创建文件,无法创建会抛出异常,不加true为重写文件
        FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);

        //fileOutputStream.write('H');
        String str = "hello";
        fileOutputStream.write(str.getBytes());//String->byte[]
        //.write(byte[],off,len)
        fileOutputStream.close();
    }
}
