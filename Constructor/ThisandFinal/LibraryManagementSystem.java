class Book {
    private static String libraryName = "Central City Library"; // Static variable shared by all books
    private String title;
    private String author;
    private final String isbn; // Final variable for unique identifier

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details with instanceof check
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("\nBook Details:");
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    // Getter for ISBN
    public String getIsbn() {
        return isbn;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Display the library name
        Book.displayLibraryName();

        // Create book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // Verify using instanceof and print the ISBN of a book
        if (book1 instanceof Book) {
            System.out.println("\nThe ISBN of book1 is: " + book1.getIsbn());
        }
    }
}
