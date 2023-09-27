//多态数组练习 instanceof 转型
package OOP.PloyArray;

public class PloyArray {
    public static void main(String[] args) {
        Person student1 = new Student(13,"wang",12345);
        Person teacher1 = new Teacher(24,"Li",32416);
        Person[] array = {student1,teacher1};

        for(Person i : array){
            i.output_info();
            if(i instanceof Student){   //向下转型调用子类特有方法
                ((Student) i).study();
            }
            else if(i instanceof Teacher) {
                ((Teacher) i).teach();
            }
        }
    }
}
