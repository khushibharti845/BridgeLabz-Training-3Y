import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Print result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
