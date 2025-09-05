import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Count digits
        String numStr = String.valueOf(number);
        int count = numStr.length();

        // Step 3: Store digits in array
        int[] digits = new int[count];
        long temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        // Step 4: Frequency array
        int[] frequency = new int[10];
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Step 5: Display frequencies
        System.out.println("\n===== Digit Frequency =====");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " → " + frequency[i] + " times");
            }
        }
    }
}
