import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Check if the input year is valid
        if (year < 1582) {
            System.out.println("Please enter a year greater than or equal to 1582.");
            return;
        }

        // Check if it's a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    // Method to check if a year is a leap year based on the conditions
    public static boolean isLeapYear(int year) {
        // Condition a: Divisible by 4 and not divisible by 100
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);

        // Condition b: Divisible by 400
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }
}
