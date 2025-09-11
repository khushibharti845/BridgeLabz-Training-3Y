class Book {
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (availability) {
            System.out.println("Book borrowed successfully!");
            availability = false;
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }
}

public class LibraryBookTest {
    public static void main(String[] args) {
        // Create a book object
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99, true);

        // Display the book details
        System.out.println("Book Details:");
        book1.displayBook();

        System.out.println();

        // Borrow the book
        System.out.println("Attempting to borrow the book...");
        book1.borrowBook();

        System.out.println();

        // Display the updated details
        System.out.println("Updated Book Details:");
        book1.displayBook();

        System.out.println();

        // Try borrowing again
        System.out.println("Attempting to borrow again...");
        book1.borrowBook();
    }
}
