//equals方法重写
public class RewriteEqual {
    public static void main(String[] args) {
        Person person1 = new Person(14,"wang");
        Person person2 = new Person(14,"wang");
        System.out.println(person1.equals(person2));//不重写会判为false，默认比较地址


        String str1 = new String("wang");
        String str2 = new String("wang");
        System.out.println(str1 == str2);


        System.out.println(person1.name == person2.name);//类的string放在常量池里,地址相同



    }
}

class Person{
    int age;
    String name;

    public boolean equals(Object obj){
        if(obj instanceof Person){
            if(this.age == ((Person) obj).age && this.name.equals(((Person) obj).name)) return true;
        }
        return false;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
