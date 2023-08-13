package MultiThreading;

//多线程实现,继承,接口,终止多线程
public class MultiThread {
    public static void main(String[] args) throws InterruptedException{
        Cat1 cat = new Cat1();

        Dog1 dog = new Dog1();
        Thread dogthread = new Thread(dog);//接口只有run方法没有start,需要代理

        runningthread runningthread1 = new runningthread();

        dogthread.start();
        cat.start();

        System.out.println(Thread.currentThread());
        for(int i = 0;i < 5; i++){
            System.out.println(i);
            Thread.sleep(300);
        }

        runningthread1.start();
        Thread.sleep(2 * 1000);
        runningthread1.setLoop(false);
    }


}
//继承Thread的多线程
class Cat1 extends Thread{
    int times = 0;
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        while(times != 3){
            System.out.println("miaomiao");
            try {
                Thread.sleep(500);times++;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }
}
//实现Runnable接口的线程
class Dog1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        int count = 0;
        while(count < 5){
            System.out.println("wang");count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class runningthread extends Thread{
    private int count = 0;
    private boolean loop = true;
    @Override
    public void run() {
        while(loop){
            System.out.println("runing...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}