import java.util.Scanner;

public class NumberChecker4 {

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

    // Method to check if the number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int[] digits = storeDigits(square);
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum == number;
    }

    // Method to check if the number is a spy number
    public static boolean isSpy(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        int product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }

    // Method to check if the number is automorphic
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if the number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon: " + isNeon(number));
        System.out.println("Is Spy: " + isSpy(number));
        System.out.println("Is Automorphic: " + isAutomorphic(number));
        System.out.println("Is Buzz: " + isBuzz(number));
    }
}
