import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Check for natural number (>= 0)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = 1;

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print result
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        sc.close();
    }
}
