package OOP;//抽象类应用-模版设计

public class AbstractClass {
    public static void main(String[] args) {
        AA AAinstance = new AA();
        BB BBinstance = new BB();
        AAinstance.calculate();
        BBinstance.calculate();
    }
}
 abstract class Template{
    public void calculate(){
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
    abstract void job();
}

class AA extends Template{
    void job(){
        long num = 1;
        for(long i = 1;i <= 80000;i++){
            num += i;
        }
    }
}

class BB extends Template{
    void job(){
        long num = 1;
        for(long i = 1;i <= 80000;i++){
            num *= i;
        }
    }
}