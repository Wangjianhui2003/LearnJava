package OOP;

//枚举类
public class Enumeration {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        switch (green){
            case GREEN:
                System.out.println("It's green");
                green.show();
                break;
            default:
                break;
        }
    }
}

interface showcolor{
    void show();
}
enum Color implements showcolor{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACK(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    @Override
    public void show() {
        System.out.println("RGB: " + redValue + " " + greenValue + " " + blueValue);
    }
    int redValue;
    int greenValue;
    int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

}