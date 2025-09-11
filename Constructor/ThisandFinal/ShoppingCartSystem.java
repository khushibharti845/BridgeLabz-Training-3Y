class Product {
    private static double discount = 10.0; // Static variable for discount percentage
    private final int productID; // Final variable for unique product ID
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to resolve ambiguity
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "% for all products.");
    }

    // Method to process and display product details with instanceof check
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("\nProduct Details:");
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Discounted Price: $" + getDiscountedPrice());
        } else {
            System.out.println("Invalid product object.");
        }
    }

    // Method to calculate discounted price
    public double getDiscountedPrice() {
        return price * quantity * (1 - discount / 100);
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create products
        Product prod1 = new Product(1001, "Laptop", 1200.00, 1);
        Product prod2 = new Product(1002, "Headphones", 150.00, 2);

        // Display initial product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();

        // Update the discount for all products
        Product.updateDiscount(15.0);

        // Display updated product details
        prod1.displayProductDetails();
        prod2.displayProductDetails();
    }
}
