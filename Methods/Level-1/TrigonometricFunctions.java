import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method
        double[] result = calculateTrigonometricFunctions(angle);

        // Output
        System.out.printf("sin(%.2f°) = %.4f%n", angle, result[0]);
        System.out.printf("cos(%.2f°) = %.4f%n", angle, result[1]);
        System.out.printf("tan(%.2f°) = %.4f%n", angle, result[2]);

        sc.close();
    }
}
