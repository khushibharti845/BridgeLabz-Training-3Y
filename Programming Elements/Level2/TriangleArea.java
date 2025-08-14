import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: base and height in cm
        System.out.print("Enter base of the triangle (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height of the triangle (cm): ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Convert cm² to in²
        // 1 inch = 2.54 cm => 1 cm = 1/2.54 inches
        // Therefore, 1 cm² = (1/2.54)² in²
        double areaIn = areaCm / (2.54 * 2.54);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaIn + " and sq cm is " + areaCm);

        sc.close();
    }
}
