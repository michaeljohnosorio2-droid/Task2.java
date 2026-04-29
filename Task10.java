import java.util.Arrays;

public class Task10 {
    static void main(String[] args) {
        Student[] students = new Student[]{
          new Student("Morgan", "Freeman"),
          new Student("Brad", "Pitt"),
          new Student("Kevin", "Spacey")
        };

        for(Student s: students){
            System.out.println(s.printFullName());
        }
    }

}
class Student{
    private String firstName;
    private String lastName;
    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String printFullName(){
        return this.firstName + " " + this.lastName;
    }
}
