package OOP;//泛型排序
import java.util.ArrayList;
import java.util.Comparator;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom",20000,new MyDate(2000,11,12)));
        employees.add(new Employee("jack",10000,new MyDate(2001,5,23)));
        employees.add(new Employee("Topson",25000,new MyDate(2003,4,29)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if(!(o1 instanceof Employee && o2 instanceof Employee)){
                    return 0;
                }
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0) return i;
                return o1.getBirthday().compareTo(o2.getBirthday());
            }

        });
        System.out.println(employees);
    }
}

class Employee{
    private String name;
    private int sal;
    private MyDate birthday;

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return '{' + "name:" + name +
                ", sal:" + sal +
                ", birthday:" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return  year + "," + month +
                "," + day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public int compareTo(MyDate o) {
        int yearMinus = getYear() - o.getYear();
        if(yearMinus != 0) return yearMinus;
        int monthMinus = getMonth() - o.getMonth();
        if(monthMinus != 0) return monthMinus;
        return getDay() - o.getDay();
    }
}