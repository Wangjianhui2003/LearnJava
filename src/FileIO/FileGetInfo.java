//文件方法
package FileIO;

import org.junit.Test;

import java.io.File;

public class FileGetInfo {
    public static void main(String[] args) {

    }

    @Test
    public void info(){
        File file = new File("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\File\\CreatedText.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
