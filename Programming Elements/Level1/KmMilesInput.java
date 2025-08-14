import java.util.Scanner;

public class KmToMilesInput {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // taking user input

        double miles = km / 1.6; // converting km to miles

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}
