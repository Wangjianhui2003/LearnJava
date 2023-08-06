public class ThreadSyncronized {
    public static void main(String[] args) {
        card card1 = new card();
        Thread thread1 = new Thread(card1);
        Thread thread2 = new Thread(card1);
        thread1.start();
        thread2.start();
    }
}

class card implements Runnable{
    private int money = 10000;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if(money < 1000){
                    System.out.println("balance is insufficient");
                    break;
                }
                money -= 1000;
                System.out.println("-1000" + " balance: " + money);
            }
        }
    }
}