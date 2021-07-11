import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner limit = new Scanner(System.in);
        System.out.print("Enter a limit of fibo:");
        int fib = limit.nextInt();
        limit.close();
        int a = 1, b = -1, s = 0;
        for (; (s = a + b) < fib;) {
            System.out.println(s + " ");
            b = a;
            a = s;
        }

    }
}
