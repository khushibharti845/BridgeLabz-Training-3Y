import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // add each number to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        // Calling method
        int sum = findSum(n);

        // Output
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
