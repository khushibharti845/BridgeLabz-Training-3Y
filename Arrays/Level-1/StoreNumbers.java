import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10]; // array of 10 elements
        double total = 0.0;                // to store sum
        int index = 0;                     // index for array

        // Infinite loop to take input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            // Break if number is 0 or negative
            if (num <= 0) {
                break;
            }

            // Break if array is full
            if (index == 10) {
                System.out.println("Array is full! Cannot store more numbers.");
                break;
            }

            // Store number in array
            numbers[index] = num;
            index++;
        }

        // Display numbers and calculate total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Display total
        System.out.println("\n\nSum of all numbers = " + total);

        sc.close();
    }
}
