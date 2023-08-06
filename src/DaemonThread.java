//守护线程
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread DaemonThread1 = new MyDaemonThread();
        Thread2 thread2 = new Thread2();

        DaemonThread1.setDaemon(true);//设置为守护线程,所有用户线程结束后结束
        DaemonThread1.start();
        thread2.start();

        for(int i = 1;i <= 4; i++){
            System.out.println("main thread is running...");
            Thread.sleep(1000);
        }

        System.out.println("main thread finished!");
    }
}

class MyDaemonThread extends Thread{//守护线程类
    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("--------------------");
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i < 8;i++){
            try {
                sleep(1000);
                System.out.println(Thread.currentThread().getName() + " is running...");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}