package OOP;

//匿名内部类应用-直接作为参数传递
public class AnonymousInnerClass {
    public static void main(String[] args) {
        CellPhone phone1 = new CellPhone();

        phone1.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("Get up Mike!");
            }
        });

        phone1.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("Get up Emma!");
            }
        });
    }
}

interface Bell{
    void ring();
}

class CellPhone{
    public void alarmclock(Bell bell){
        bell.ring();
    }
}