public class Interface {
    public static void main(String[] args) {
        USB[] usb_set = new USB[2];
        usb_set[0] = new Phone();
        usb_set[1] = new Camera();
        for(USB i : usb_set){
            i.work();
            if(i instanceof Phone){
                ((Phone) i).call();
            }
        }
    }
}

interface USB{
    void work();
}

class Phone implements USB{
    @Override
    public void work() {
        System.out.println("Phone is working");
    }
    void call(){
        System.out.println("Calling...");
    }
}

class Camera implements USB{
    @Override
    public void work() {
        System.out.println("Camera is working");
    }
}