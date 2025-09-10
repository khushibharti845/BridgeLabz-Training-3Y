import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number greater than 0.");
            return;
        }

        // Find sum using recursion
        int recursiveSum = sumRecursive(n);

        // Find sum using formula
        int formulaSum = sumFormula(n);

        // Display both results
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("The results are the same. Computation is correct!");
        } else {
            System.out.println("The results are different. Check your implementation.");
        }
    }

    // Recursive method to calculate sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Method to calculate sum using formula n*(n+1)/2
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
}
