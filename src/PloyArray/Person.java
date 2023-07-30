package PloyArray;

public class Person {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void output_info() {
        System.out.println("name:" + name + " age:" + age);
    }
}