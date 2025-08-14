import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking distance in feet from user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Conversion factors
        double yards = distanceInFeet / 3;       // 1 yard = 3 feet
        double miles = yards / 1760;              // 1 mile = 1760 yards

        // Output
        System.out.println("The distance in yards is " + yards + 
                           " and in miles is " + miles);

        input.close();
    }
}
