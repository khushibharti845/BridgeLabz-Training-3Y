class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateTotalCost();
    }

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.totalCost = calculateTotalCost();
    }

    // Method to calculate the total cost based on rental days and car model
    private double calculateTotalCost() {
        double ratePerDay = 0;

        switch (carModel.toLowerCase()) {
            case "sedan":
                ratePerDay = 50;
                break;
            case "suv":
                ratePerDay = 80;
                break;
            case "luxury":
                ratePerDay = 120;
                break;
            default:
                ratePerDay = 40;
                break;
        }

        return ratePerDay * rentalDays;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : $" + totalCost);
    }
}

public class CarRentalTest {
    public static void main(String[] args) {
        // Using parameterized constructor
        CarRental rental1 = new CarRental("John Doe", "SUV", 5);
        System.out.println("Rental Details (Parameterized Constructor):");
        rental1.displayRentalDetails();

        System.out.println();

        // Using default constructor
        CarRental rental2 = new CarRental();
        System.out.println("Rental Details (Default Constructor):");
        rental2.displayRentalDetails();
    }
}
