class Book {
    String title;
    String author;
    int year;

    // Constructor 1: Takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.year = -1; // Default year when year is not specified
    }

    // Constructor 2: Takes title, author, and year
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Constructor 3: Takes no parameters, sets default values
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.year = -1;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        if (year != -1) {
            System.out.println("Year: " + year);
        } else {
            System.out.println("Year: Unknown");
        }
        System.out.println();
    }
}

public class COverloadDemo {
    public static void main(String[] args) {
        // Create books using different constructors
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book();

        // Display book details
        book1.display();
        book2.display();
        book3.display();
    }
}
