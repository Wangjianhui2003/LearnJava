//BufferedReader,BufferedWriter for character
//BufferedInputStream,BufferedOutputStream for binary file
package FileIO;

import org.junit.Test;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) {
    }

    public void filewrite(){
        //
    }

    public void fileread(){
        //
    }
    @Test
    public void textfilecopy() throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\CreatedText.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String fileDesPath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\CreatedText(3).txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileDesPath));
        String line = "";

        while((line = bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
    @Test
    public void binaryfilecopy() throws IOException {
        String filePath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\LinaImage.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
        String fileDesPath = "C:\\Users\\wjh2\\JavaProject\\LearnJava\\src\\FileIO\\LinaImage(2).jpg";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileDesPath));

        byte[] data = new byte[1024];
        int readLen;

        while((readLen = bufferedInputStream.read(data)) != -1){
            bufferedOutputStream.write(data,0,readLen);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
