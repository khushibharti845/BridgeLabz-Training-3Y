import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if input is a natural number (>= 1)
        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Calculation using formula
            int formulaSum = n * (n + 1) / 2;

            // Calculation using for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Display results
            System.out.println("Sum using formula (n*(n+1)/2): " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            // Compare results
            if (formulaSum == loopSum) {
                System.out.println("✅ Both computations are correct and equal.");
            } else {
                System.out.println("❌ Results do not match!");
            }
        }

        sc.close();
    }
}
