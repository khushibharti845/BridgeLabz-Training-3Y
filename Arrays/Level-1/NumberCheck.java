import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5]; // Array of 5 elements

        // Taking input
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking numbers
        System.out.println("\nResults:");
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number " + num + " is Positive and Even.");
                } else {
                    System.out.println("Number " + num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number " + num + " is Negative.");
            } else {
                System.out.println("Number " + num + " is Zero.");
            }
        }

        // Comparing first and last element
        System.out.println("\nComparison of first and last element:");
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First element (" + numbers[0] + ") is EQUAL to Last element (" + numbers[4] + ").");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element (" + numbers[0] + ") is GREATER than Last element (" + numbers[4] + ").");
        } else {
            System.out.println("First element (" + numbers[0] + ") is LESS than Last element (" + numbers[4] + ").");
        }

        sc.close();
    }
}
