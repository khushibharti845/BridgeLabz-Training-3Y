import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11]; // array for 11 players
        double sum = 0.0;

        // Taking input
        System.out.println("Enter the heights of 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i]; // add to sum while taking input
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.println("\nThe mean height of the football team is: " + mean);

        sc.close();
    }
}
