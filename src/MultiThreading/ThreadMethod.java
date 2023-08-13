package MultiThreading;

//线程插队,join方法
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1 = new Thread1();
        thread1.start();

        for(int i = 1;i <= 10;i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " running...");
            if(i == 5){
                System.out.println(thread1.getName() + " join!");
                thread1.join();//让thread1线程插队
                System.out.println("thread1 finished!");//插队线程结束后继续执行
            }
        }
    }
}

class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i = 1;i <= 10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " running...");
        }
    }
}