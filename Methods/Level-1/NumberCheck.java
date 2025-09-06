import java.util.Scanner;

public class NumberCheck {

    // Method to check number sign
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // Positive
        } else if (num < 0) {
            return -1;  // Negative
        } else {
            return 0;   // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking number
        int result = checkNumber(number);

        // Output
        if (result == 1) {
            System.out.println(number + " is a Positive number.");
        } else if (result == -1) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
