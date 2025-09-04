import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number input
        System.out.print("Enter a number (between 6 and 9): ");
        int number = sc.nextInt();

        // Check if number is in range
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9!");
        } else {
            // Define array to store multiplication results (10 results: 1–10)
            int[] multiplicationResult = new int[10];

            // Generate multiplication table
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[i - 1] = number * i;
            }

            // Display results
            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
            }
        }

        sc.close();
    }
}
