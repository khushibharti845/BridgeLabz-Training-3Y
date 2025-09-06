import java.util.Scanner;

public class   TriangularParkRun{

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;  // in meters
        double distance = 5000;  // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for sides of the triangle
        System.out.print("Enter side 1 of the park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the park (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Output
        System.out.println("The athlete must complete " + Math.ceil(rounds) 
                           + " rounds to run at least 5 km.");

        sc.close();
    }
}
