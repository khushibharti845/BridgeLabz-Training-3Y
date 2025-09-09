import java.util.Scanner;

public class AthleteRun {

    // Method to calculate the number of rounds required
    public static int calculateRounds(double side1, double side2, double side3, double targetDistance) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(targetDistance / perimeter); // Round up to ensure the athlete completes at least 5km
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of the triangle
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = scanner.nextDouble();

        double targetDistance = 5000.0; // 5 km in meters

        // Calculate number of rounds
        int rounds = calculateRounds(side1, side2, side3, targetDistance);

        // Display the result
        System.out.println("The athlete must complete " + rounds + " rounds to run at least 5 km.");

        scanner.close();
    }
}
