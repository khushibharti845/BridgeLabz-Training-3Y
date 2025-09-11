class Patient {
    private static String hospitalName = "City Hospital"; // Shared among all patients
    private static int totalPatients = 0; // Counts total admitted patients

    private final String patientID; // Unique identifier, cannot be changed
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize instance variables
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients when a new patient is created
    }

    // Static method to get total patients admitted
    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Method to display patient details with instanceof check
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("\nPatient Details:");
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patient objects
        Patient patient1 = new Patient("P1001", "Alice Johnson", 32, "Flu");
        Patient patient2 = new Patient("P1002", "Bob Smith", 45, "Fracture");

        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Show total patients admitted
        Patient.getTotalPatients();
    }
}
