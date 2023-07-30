//键盘输入实例
import java.util.Scanner;
public class Input{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		System.out.println("please input your name");
		String name = myScanner.next();

		System.out.println("please input your age");
		int age = myScanner.nextInt();
		
		System.out.println(name + ":" + age);

	}
}