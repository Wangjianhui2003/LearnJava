//输入指令终止线程
import java.util.Scanner;

public class ThreadQuit {
    public static void main(String[] args) {
        print100 a = new print100();
        check b = new check(a);//重点
        a.start();//打印开始
        b.start();//检查开始
    }
}

//打印数字
class print100 extends Thread{
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
            System.out.println((int)(Math.random() * 100 + 1));
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
//输入Q后结束print100线程
class check extends Thread{
    private print100 a;
    private Scanner scanner = new Scanner(System.in);
    public check(print100 a){//重点
        this.a = a;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("input:");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q') {
                a.setLoop(false);
                break;
            }
        }
    }
}