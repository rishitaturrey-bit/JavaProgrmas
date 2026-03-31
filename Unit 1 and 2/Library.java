import java.util.*;

class Book {
    String title, author, isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(b -> b.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("Java", "James", "101"));
        lib.addBook(new Book("Python", "Guido", "102"));

        lib.displayBooks();
        lib.removeBook("101");
        System.out.println("After Removal:");
        lib.displayBooks();
    }
}