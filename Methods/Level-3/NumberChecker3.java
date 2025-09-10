import java.util.Scanner;

public class NumberChecker3 {

    // Method to count digits in the number
    public static int countDigits(int number) {
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) return 1;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Method to store digits in an array
    public static int[] storeDigits(int number) {
        int n = Math.abs(number);
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int n = digits.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = digits[n - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] a1, int[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d != 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = storeDigits(number);

        System.out.println("Digits count: " + countDigits(number));
        System.out.print("Digits: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed Digits: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Arrays equal: " + compareArrays(digits, reversed));

        System.out.println("Is Palindrome: " + isPalindrome(number));

        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }
}
