import java.util.Scanner;

public class NumberCheck {

    // Method to determine if the number is positive, negative, or zero
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1; // Positive
        } else if (number < 0) {
            return -1; // Negative
        } else {
            return 0; // Zero
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Call the method to check the number
        int result = checkNumber(number);

        // Display the output based on result
        if (result == 1) {
            System.out.println("The number is positive.");
        } else if (result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}

