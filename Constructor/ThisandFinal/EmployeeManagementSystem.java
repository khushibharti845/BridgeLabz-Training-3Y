class Employee {
    private static String companyName = "Tech Solutions Inc."; // Static variable shared across all employees
    private static int totalEmployees = 0; // Static counter for total employees
    
    private String name;
    private final int id; // Final variable for employee ID
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    // Method to display employee details with instanceof check
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("\nEmployee Details:");
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create employee objects
        Employee emp1 = new Employee("Alice Johnson", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob Smith", 102, "Project Manager");

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employees using static method
        Employee.displayTotalEmployees();
    }
}
