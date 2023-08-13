package OOP;

//继承练习
//IDEA快速创建构造方法
public class ExtendsExercise {
    public static void main(String[] args) {
        PC pc = new PC(1,1,1,"a OOP.PC");
        NotePad notepad = new NotePad(2,2,2,"green");
        pc.getDetails();
        notepad.getDetails();
    }
}

class Computer{
    public int cpu;
    public int memory;
    public int disk;

    Computer(int cpu,int memory,int disk){
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public void getDetails(){
        System.out.println("cpu:" + cpu + "memory:" + memory + "disk:" + disk);
    }

}

class PC extends Computer{
    private String brand;
    PC(int cpu,int memory,int disk,String brand){
        super(cpu,memory,disk);
        this.brand = brand;
    }
    public void cbrand(String brand){
        this.brand=brand;
    }
    public void getDetails(){
        System.out.println("cpu:" + cpu + "memory:" + memory + "disk:" + disk + "brand:" + brand);
    }

}

class NotePad extends Computer{
    private String color;

    public NotePad(int cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void ccolor(String color){
        this.color = color;
    }

    public void getDetails(){
        System.out.println("cpu:" + cpu + "memory:" + memory + "disk:" + disk + "color" + color);
    }
}