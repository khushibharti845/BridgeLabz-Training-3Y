import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Step 2: Arrays for marks, percentages, and grades
        int[][] marks = new int[n][3];   // physics, chemistry, maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 3: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            // Input Physics marks
            while (true) {
                System.out.print("Physics marks: ");
                marks[i][0] = sc.nextInt();
                if (marks[i][0] >= 0) break;
                System.out.println("Invalid! Marks cannot be negative.");
            }

            // Input Chemistry marks
            while (true) {
                System.out.print("Chemistry marks: ");
                marks[i][1] = sc.nextInt();
                if (marks[i][1] >= 0) break;
                System.out.println("Invalid! Marks cannot be negative.");
            }

            // Input Maths marks
            while (true) {
                System.out.print("Maths marks: ");
                marks[i][2] = sc.nextInt();
                if (marks[i][2] >= 0) break;
                System.out.println("Invalid! Marks cannot be negative.");
            }

            // Step 4: Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Step 5: Assign grade
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // Step 6: Display results
        System.out.println("\n===== Student Report =====");
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-10s%n",
                "Physics", "Chemistry", "Maths", "Total", "Percentage", "Grade");

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            System.out.printf("%-10d %-10d %-10d %-12d %-12.2f %-10c%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    total, percentage[i], grade[i]);
        }
    }
}

