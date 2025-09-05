

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Arrays to store salary, years of service, bonus, and new salary
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Totals
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            // Salary input with validation
            while (true) {
                System.out.print("Enter Salary: ");
                salary[i] = sc.nextDouble();
                if (salary[i] > 0) break; // valid salary
                System.out.println("Invalid salary. Please enter again.");
            }

            // Years of service input with validation
            while (true) {
                System.out.print("Enter Years of Service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) break; // valid service years
                System.out.println("Invalid years of service. Please enter again.");
            }
        }

        // Processing loop
        for (int i = 0; i < 10; i++) {
            // Bonus calculation
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // New salary = old salary + bonus
            newSalary[i] = salary[i] + bonus[i];

            // Update totals
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }

        // Final output
        System.out.println("\n===== Bonus Report for Zara =====");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Years of Service: " + yearsOfService[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        System.out.println("\nTotal Old Salary of All Employees: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary of All Employees: " + totalNewSalary);
    }
}
 
