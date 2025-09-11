class Vehicle {
    private static double registrationFee = 500.0; // Common for all vehicles

    private final String registrationNumber; // Unique and final
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to initialize instance variables
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Method to display vehicle registration details with instanceof check
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("\nVehicle Registration Details:");
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Create vehicle objects
        Vehicle vehicle1 = new Vehicle("REG1234", "John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("REG5678", "Jane Smith", "Motorcycle");

        // Display registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(750.0);

        // Display updated registration details
        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}
