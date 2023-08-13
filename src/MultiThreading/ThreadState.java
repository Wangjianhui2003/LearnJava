package MultiThreading;

//线程周期,thread.state
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
        Thread3 thread = new Thread3();
        System.out.println(thread.getName() + ":" + thread.getState());
        thread.start();
        while(thread.getState() != Thread.State.TERMINATED){
            System.out.println(thread.getName() + ":" + thread.getState());
            Thread.sleep(700);
        }
        System.out.println(thread.getName() + ":" + thread.getState());
    }
}

class Thread3 extends Thread{
    @Override
    public void run() {
        while(true){
            for(int i = 0;i < 5;i++){
                System.out.println("----------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}