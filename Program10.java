class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
    }
}

class Library {

    public void borrowBook(Book book) {
        System.out.println("Borrowing book...");
        book.displayBook();
    }
}

public class Program10 {

    public static void main(String[] args) {

        Book book = new Book(
                "Object Oriented Programming",
                "Robert C. Martin"
        );

        Library library = new Library();

        library.borrowBook(book);
    }
}