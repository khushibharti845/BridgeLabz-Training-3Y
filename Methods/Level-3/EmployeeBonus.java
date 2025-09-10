import java.util.Random;
import java.util.Scanner;

public class EmployeeBonus {

    // Method to generate salary and years of service for each employee
    public static int[][] generateEmployeeData(int numberOfEmployees) {
        int[][] data = new int[numberOfEmployees][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate 5-digit salary between 10000 and 99999
            data[i][0] = 10000 + rand.nextInt(90000);
            // Generate years of service between 1 and 10
            data[i][1] = 1 + rand.nextInt(10);
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(int[][] data) {
        int n = data.length;
        double[][] result = new double[n][2]; // column 0: new salary, column 1: bonus amount

        for (int i = 0; i < n; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }

    // Method to display the details and calculate totals
    public static void displayResults(int[][] data, double[][] results) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-10s\n", "Employee", "Old Salary", "New Salary", "Bonus");

        for (int i = 0; i < data.length; i++) {
            int oldSalary = data[i][0];
            double newSalary = results[i][0];
            double bonus = results[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15.2f %-10.2f\n", (i + 1), (double) oldSalary, newSalary, bonus);
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15.2f %-10.2f\n", "Total", totalOldSalary, totalNewSalary, totalBonus);
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        int[][] employeeData = generateEmployeeData(numberOfEmployees);
        double[][] results = calculateNewSalaryAndBonus(employeeData);

        displayResults(employeeData, results);
    }
}
