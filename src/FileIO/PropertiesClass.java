package FileIO;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\Properties.txt"));
        properties.list(System.out);//罗列所有

        String user = properties.getProperty("user");//获取
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);
    }
    @Test
    public void create_properties() throws IOException {
        Properties properties = new Properties();

        properties.setProperty("user","Emily");//创建或修改
        properties.setProperty("pwd","1234");

        properties.store(new FileWriter("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\Properties.txt"),
                "this is a comment");//存储

    }
}
