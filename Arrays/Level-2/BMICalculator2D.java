import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Step 2: 2D array for person data: [i][0]=weight, [i][1]=height, [i][2]=BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Step 3: Input weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            // Weight input with validation
            while (true) {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) break;
                System.out.println("Invalid input. Please enter a positive value.");
            }

            // Height input with validation
            while (true) {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) break;
                System.out.println("Invalid input. Please enter a positive value.");
            }

            // Step 4: Calculate BMI
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Step 5: Determine weight status
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (personData[i][2] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Step 6: Display results
        System.out.println("\n===== BMI Report =====");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
    }
}
