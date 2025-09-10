import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Get number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Get the first day of the month using Gregorian Calendar algorithm
    public static int getFirstDay(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int day = (1 + 13 * (month + 1) / 5 + k + k/4 + j/4 + 5 * j) % 7;
        // 0 = Saturday, 1 = Sunday, ..., 6 = Friday
        // Adjust so that 0 = Sunday, ..., 6 = Saturday
        return (day + 6) % 7;
    }

    public static void displayCalendar(int month, int year) {
        System.out.println("     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int days = getNumberOfDays(month, year);

        // Indentation for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.println();
        displayCalendar(month, year);
    }
}
