package packageB;
import packageA.*;

class Student extends Person {
    void displayStudentWeight() {
        System.out.println("Weight: " + this.weight); // This is accessible as this is public.
    }
}

public class AccessModifier {
    public static void main( String[] args ) {

        Student student = new Student();
        student.displayStudentWeight();

    }
}
