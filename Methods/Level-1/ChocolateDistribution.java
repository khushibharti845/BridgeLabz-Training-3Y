import java.util.Scanner;

public class ChocolateDistribution {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Chocolates per child
        result[1] = number % divisor; // Remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from the user
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        System.out.print("Enter the total number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Check if divisor is zero
        if (numberOfChildren == 0) {
            System.out.println("Number of children cannot be zero.");
        } else {
            // Call the method to compute quotient and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display the results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates = " + result[1]);
        }

        scanner.close();
    }
}
