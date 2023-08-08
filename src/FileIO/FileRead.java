//FileReader
package FileIO;

import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText3";
        FileReader fileReader = new FileReader(filePath);

        int data = 0;

        while((data = fileReader.read()) != -1){
            System.out.print( (char)data );
        }

        if(fileReader != null){
            fileReader.close();
        }
    }

    public void FileRead2() throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText3";
        FileReader fileReader = new FileReader(filePath);

        int readLen = 0;
        char[] buf = new char[8];

        while((readLen = fileReader.read(buf)) != -1){//.read返回读取的字符个数
            System.out.print(new String(buf,0,readLen));
        }

        if(fileReader != null){
            fileReader.close();
        }
    }
}
