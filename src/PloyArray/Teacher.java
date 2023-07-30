package PloyArray;

public class Teacher extends Person{
    int teacher_id;

    public Teacher(int age, String name, int teacher_id) {
        super(age, name);
        this.teacher_id = teacher_id;
    }

    @Override
    void output_info() {
        System.out.println("[Teacher]teacher id:" + teacher_id);
        super.output_info();
    }

    public void teach(){
        System.out.println("teaching...");
    }
}
