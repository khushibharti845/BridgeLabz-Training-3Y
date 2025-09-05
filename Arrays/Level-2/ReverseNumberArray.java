import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Count digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Step 3: Store digits in array
        int[] digits = new int[count];
        temp = number;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 4: Create reverse array
        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        // Step 5: Display reversed number
        System.out.print("\nDigits in reverse order: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }
        System.out.println();
    }
}
