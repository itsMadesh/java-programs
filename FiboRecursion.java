import java.util.Scanner;

public class FiboRecursion {
    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit;
        System.out.print("Enter a limit of fibonacci:");
        limit = scan.nextInt();
        scan.close();
        for (int i = 1; i <= limit; i++) {
            System.out.println(fib(i));
        }
    }
}
