class Book {
    String title;
    String isbn;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public Book(String title) {
        this(title, "PENDING");
    }

    public void printStatus() {
        System.out.println(title + " | " + isbn + " | Catalogued: true");
    }
}

public class LibraryBook {
    public static void main(String[] args) {

        Book[] books = {
            new Book("Clean Code", "978-0132350884"),
            new Book("Untitled Draft"),
            new Book("1984", "9780451524935"),
            new Book("Notes")
        };

        for (Book book : books) {
            book.printStatus();
        }
    }
}