//创建文件

package FileIO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {

    }
    @Test
    public void create1() throws IOException {
        String filepath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText.txt";
        File file = new File(filepath);
        file.createNewFile();
        System.out.println("created successfully!");
    }
    @Test
    public void create2() throws IOException {
        File filepath = new File("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\");
        String filename = "CreatedText2";
        File file = new File(filepath,filename);
        file.createNewFile();
        System.out.println("created successfully!");
    }
    @Test
    public void create3() throws IOException {
        String filepath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\";
        String filename = "CreatedText3";
        File file = new File(filepath,filename);
        file.createNewFile();
        System.out.println("created successfully!");
    }
}
