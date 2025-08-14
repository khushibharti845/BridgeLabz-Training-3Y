import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double height = input.nextDouble();

        // Area in square inches
        double areaInches = 0.5 * base * height;

        // Convert to square centimeters (1 inch = 2.54 cm, so 1 sq inch = 2.54² sq cm)
        double areaCm = areaInches * Math.pow(2.54, 2);

        // Output
        System.out.println("The area of the triangle is " + areaInches + " square inches and " 
                           + areaCm + " square centimeters.");

        input.close();
    }
}
