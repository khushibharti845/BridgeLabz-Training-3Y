class Student {
    private static String universityName = "Global University"; // Shared by all students
    private static int totalStudents = 0; // To track total enrolled students

    private final int rollNumber; // Final variable, unique for each student
    private String name;
    private String grade;

    // Constructor using 'this' to initialize instance variables
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("\nStudent Details:");
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Method to update grade with instanceof check
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Invalid student object.");
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student(101, "Alice", "A");
        Student student2 = new Student(102, "Bob", "B");

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Display total students
        Student.displayTotalStudents();

        // Update a student's grade
        student1.updateGrade("A+");

        // Display updated details
        student1.displayStudentDetails();
    }
}
