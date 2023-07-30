package PloyArray;

public class Student extends Person{
    int student_id;

    public Student(int age, String name, int student_id) {
        super(age, name);
        this.student_id = student_id;
    }

    @Override
    void output_info() {
        System.out.println("[Student]student id:" + student_id);
        super.output_info();
    }

    public void study(){
        System.out.println("studying...");
    }
}
