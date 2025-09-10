import java.util.Scanner;

public class EuclideanAndLine {

    // Method to calculate the Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate the equation of the line (slope and y-intercept)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double m, b;
        if (x1 == x2) {
            // Avoid division by zero for vertical lines
            m = Double.POSITIVE_INFINITY;
            b = Double.NaN;
        } else {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - m * x1;
        }
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        // Calculate distance
        double distance = calculateDistance(x1, y1, x2, y2);

        // Calculate line equation
        double[] line = calculateLineEquation(x1, y1, x2, y2);
        double slope = line[0];
        double intercept = line[1];

        // Display results
        System.out.printf("\nEuclidean Distance: %.4f\n", distance);

        if (Double.isInfinite(slope)) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            System.out.printf("Equation of the line: y = %.4fx + %.4f\n", slope, intercept);
        }
    }
}
