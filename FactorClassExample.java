public class FactorClassExample {

    public static void main(String[] args) {
        Student s1 = StudentFactory.getInstance();
        System.out.println("done" + s1);
    }
}

class StudentFactory {
    public static Student getInstance() {
        return new Student();
    }
}

class Student {

}