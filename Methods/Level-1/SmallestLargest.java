import java.util.Scanner;

public class SmallestLargest {

    // Method to find and print the smallest and largest of three numbers
    public static void findSmallestAndLargest(int num1, int num2, int num3) {
        int smallest = num1;
        int largest = num1;

        // Compare for smallest
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        // Compare for largest
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Output the results
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get inputs from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Call the method to find smallest and largest
        findSmallestAndLargest(num1, num2, num3);

        scanner.close();
    }
}
