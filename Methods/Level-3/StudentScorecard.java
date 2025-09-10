import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random scores for Physics, Chemistry, and Maths
    public static int[][] generatePCM(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        Random rand = new Random();

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + rand.nextInt(90); // Physics score (10-99)
            scores[i][1] = 10 + rand.nextInt(90); // Chemistry score (10-99)
            scores[i][2] = 10 + rand.nextInt(90); // Maths score (10-99)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // column 0: total, 1: average, 2: percentage

        for (int i = 0; i < n; i++) {
            int physics = scores[i][0];
            int chemistry = scores[i][1];
            int maths = scores[i][2];
            int total = physics + chemistry + maths;
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t");
            System.out.print(results[i][2] + "%\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int[][] scores = generatePCM(numberOfStudents);
        double[][] results = calculateResults(scores);
        System.out.println();
        displayScorecard(scores, results);
    }
}
