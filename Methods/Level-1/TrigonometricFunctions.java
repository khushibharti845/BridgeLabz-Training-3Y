import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent of the angle
    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert angle to radians

        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        return new double[] { sinValue, cosValue, tanValue };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrigonometricFunctions trig = new TrigonometricFunctions();

        // Input from user
        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        // Calculate trigonometric functions
        double[] results = trig.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("For angle %.2f degrees:%n", angle);
        System.out.printf("Sine = %.4f%n", results[0]);
        System.out.printf("Cosine = %.4f%n", results[1]);
        System.out.printf("Tangent = %.4f%n", results[2]);

        scanner.close();
    }
}
