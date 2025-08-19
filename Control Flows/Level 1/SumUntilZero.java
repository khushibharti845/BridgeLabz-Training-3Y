import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;   // to store the sum
        double number;        // user input

        System.out.print("Enter a number (0 to stop): ");
        number = sc.nextDouble();

        // Keep looping until user enters 0
        while (number != 0) {
            total += number;  // add to total
            System.out.print("Enter a number (0 to stop): ");
            number = sc.nextDouble();
        }

        // After loop ends
        System.out.println("The total sum is " + total);

        sc.close();
    }
}
