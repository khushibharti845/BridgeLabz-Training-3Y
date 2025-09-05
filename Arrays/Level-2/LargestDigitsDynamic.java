import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); // use long in case number is very large

        // Step 2: Initial array size
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Step 3: Extract digits
        while (number != 0) {
            int digit = (int)(number % 10); // get last digit
            digits[index] = digit;
            index++;

            // Resize array if needed
            if (index == maxDigit) {
                maxDigit += 10; // increase capacity
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; // reassign
            }

            number /= 10; // remove last digit
        }

        // Step 4: Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Step 5: Output
        System.out.println("\n===== Results =====");
        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\nLargest digit: " + largest);

        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit not found (all digits same).");
        }
    }
}
