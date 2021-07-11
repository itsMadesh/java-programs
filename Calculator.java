public class Calculator {

    int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int c = a + b;
        System.out.println("a+b=" + c);
    }

    public void sub() {
        int d = a * b;
        System.out.println("a-b=" + d);
    }

    public static void main(String[] args) {
        Calculator t1 = new Calculator(2, 3);
        t1.add();
        t1.sub();
        Calculator t2 = new Calculator(4, 0);
        t2.add();
        t2.sub();
    }
}