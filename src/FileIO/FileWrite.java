package FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText3";
        FileWriter fileWriter = new FileWriter(filePath,true);
        fileWriter.write("helloWorld");//int,char[],char|off|len,String,String|off|len
        fileWriter.close();//"hello".toCharArray()
    }

}
