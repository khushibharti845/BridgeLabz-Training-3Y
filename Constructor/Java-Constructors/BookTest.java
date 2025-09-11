class Book {
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : $" + price);
    }
}

public class BookTest {
    public static void main(String[] args) {
        // Using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book:");
        defaultBook.displayBookDetails();

        System.out.println();

        // Using parameterized constructor
        Book paramBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        System.out.println("Parameterized Book:");
        paramBook.displayBookDetails();
    }
}
