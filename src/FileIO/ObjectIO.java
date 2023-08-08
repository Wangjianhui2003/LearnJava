//对象流,序列化,反序列化
package FileIO;

import org.junit.Test;

import java.io.*;

public class ObjectIO {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\ObjectFile.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);//int -> Integer
        oos.writeBoolean(true);//boolean -> Boolean
        oos.writeChar('a');//char -> Character
        oos.writeDouble(9.9);//double -> Double
        oos.writeUTF("你好");
        oos.writeObject(new Dog("DODO",10));

        oos.close();
    }

    @Test
    public void inputobject() throws IOException, ClassNotFoundException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\ObjectFile.txt";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        //按顺序反序列化
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        //获得类,要使用该类的方法,注意导入类和向下转型
        Object var = ois.readObject();
        System.out.println(var.getClass());
        System.out.println(var);

        ois.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}