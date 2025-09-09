import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate the sum of n natural numbers using a loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        // Calculate the sum using the method
        int sum = calculateSum(n);

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
