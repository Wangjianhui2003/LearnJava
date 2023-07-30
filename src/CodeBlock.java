//代码块
public class CodeBlock {
    public static void main(String[] args) {
        ACat cat1 = new ACat();
    }
}

class ACat{

    {
        System.out.println("A new cat!!!");
    }

    public ACat(){
        System.out.println("Constructor is called");
    }
}