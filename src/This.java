//this关键字
public class This
{
	public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("Dog:" + dog.out() + " " + "Cat:" + cat.out());

	}

}
class Dog{
	public int out(){
		return this.hashCode();
	}
}

class Cat{
	public int out(){
		return this.hashCode();
	}
}