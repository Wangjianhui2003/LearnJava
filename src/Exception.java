//异常处理
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while(true){
            System.out.println("input a integer");
            inputStr = scanner.next();
            try{
                num = Integer.parseInt(inputStr);
                break;
            }catch (NumberFormatException e) {
                System.out.println("not a integer");
            }
        }
        System.out.println("inputed" + num);
    }
}