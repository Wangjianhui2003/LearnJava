//例子
package Reflection;

public class Cat {
    private String name = "kitty";
    private int age = 6;

    public void hi(String content){
        System.out.println("Cat:hi " + content);
    }

    public Cat() {//默认构造器
    }

    public Cat(String name) {//公有构造器
        this.name = name;
    }

    private Cat(String name,int age){//私有构造器
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
