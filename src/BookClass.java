public class BookClass {

    public static void main(String[] args) {

        // Create a book using the normal constructor
        Book book1 = new Book("Java Basics", "John Doe");
        book1.displayInfo();

        // Create a book with invalid values (to test validation)
        Book book2 = new Book("", null);
        book2.displayInfo();

        // Create a book using the default constructor
        Book book3 = new Book();
        book3.displayInfo();
    }
}

//      BOOK CLASS

class Book {
    String title;
    String author;

    // Default constructor (Bonus)
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
    }

    // Constructor with validation
    public Book(String title, String author) {

        // Validate title
        if (title == null || title.trim().isEmpty()) {
            this.title = "Unknown";
        } else {
            this.title = title;
        }

        // Validate author
        if (author == null || author.trim().isEmpty()) {
            this.author = "Anonymous";
        } else {
            this.author = author;
        }
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
