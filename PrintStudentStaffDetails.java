
class PrintStudentStaffDetails {
    private void summa(){}

    

    public static void main(String[] arg) {
        PrintStudentStaffDetails p = new PrintStudentStaffDetails();
        p.summa();
        // StaffAttr s1 = new StaffAttr("pavis", 45, 1000);
        // s1.print();
        StudentAttr s2 = new StudentAttr("madesh", 19, 9);
        s2.print();
        StudentAttr s3 =s2;
        s3.print();
        s2.cgpa = 4;
        s2.print();
        s3.print();
    }

}

abstract class HumanAttr {
    String name;
    int age;

    public HumanAttr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        // System.out.println("Name:" + name);
        // System.out.println("Age:" + age);
    }

}

class StaffAttr extends HumanAttr {

    float salary;

    public StaffAttr(String name, int age, float salary) {
        super(name, age);
        this.salary = salary;
    }

    public void print() {
        super.print();
        System.out.println("Salary:" + salary);
    }
}

class StudentAttr extends HumanAttr {

    public float cgpa;

    public StudentAttr(String name, int age, float cgpa) {
        super(name, age);
        this.cgpa = cgpa;
    }

    public void print() {
        super.print();
        System.out.println("cgpa:" + this.cgpa);
        this.dummy();
    }

    private void dummy(){
        StudentAttr s4 = this;
        s4.print();
    }
}
