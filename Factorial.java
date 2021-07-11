import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
        input.close();
        int fact = 1;
        for (int a = n; a >= 1; a--) {
            fact *= a;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }

}
