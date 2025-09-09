import java.util.Scanner;

public class QuotientAndRemainder {

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Quotient
        result[1] = number % divisor; // Remainder
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the dividend (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if divisor is zero
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            // Call the method and get the result
            int[] result = findRemainderAndQuotient(number, divisor);

            // Display the quotient and remainder
            System.out.println("Quotient = " + result[0]);
            System.out.println("Remainder = " + result[1]);
        }

        scanner.close();
    }
}
