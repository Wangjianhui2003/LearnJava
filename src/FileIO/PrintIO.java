package FileIO;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintIO {
    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        out.print("Hello");
        out.write("hello".getBytes());

        out.close();

        System.setOut(new PrintStream("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\Print.txt"));
        System.out.println("Hello");
    }

    @Test
    public void PrintW() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\Print.txt"));
        printWriter.print("hi");
        printWriter.close();

    }
}
