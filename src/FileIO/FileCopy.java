//copyfile:fileinputstream.read -> buf -> fileoutputstream.write -> disk
package FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText.txt";
        String fileDesPath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText(2).txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(fileDesPath);

        byte[] buf = new byte[1024];
        int readlen;

        while((readlen = fileInputStream.read(buf)) != -1){
            fileOutputStream.write(buf,0,readlen);

        }

        System.out.println("copied!");

        fileInputStream.close();
        fileOutputStream.close();

    }
}
