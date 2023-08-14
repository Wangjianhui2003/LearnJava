//反射机制 初识Class类
package Reflection;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ClassTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\Reflection\\class.properties"));

        String classpath = properties.getProperty("classpath");//Reflection.Cat
        String MethodName1 = properties.getProperty("method1");//hi method

        Class<?> cls = Class.forName(classpath);
        Object o = cls.getDeclaredConstructor().newInstance();//newInstance outdated

        Method method1 = cls.getMethod(MethodName1,String.class);
        method1.invoke(o,"hello");

    }
}
