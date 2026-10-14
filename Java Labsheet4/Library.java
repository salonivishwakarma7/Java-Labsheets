public class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBooks(int numberOfBooks) {
        int requestedBooks = numberOfBooks;

        if (requestedBooks <= 0) {
            System.out.println("Enter a valid number of books.");
        } else if (requestedBooks > booksAvailable) {
            System.out.println("Not enough books available.");
        } else {
            booksAvailable = booksAvailable - requestedBooks;
            System.out.println(requestedBooks + " book(s) issued successfully.");
        }

        System.out.println("Books Available: " + booksAvailable);
    }

    void returnBooks(int numberOfBooks) {
        int returnedBooks = numberOfBooks;

        if (returnedBooks <= 0) {
            System.out.println("Enter a valid number of books.");
        } else {
            booksAvailable = booksAvailable + returnedBooks;
            System.out.println(returnedBooks + " book(s) returned successfully.");
        }

        System.out.println("Books Available: " + booksAvailable);
    }

    public static void main(String[] args) {
        int initialBooks = 50;

        Library library = new Library(initialBooks);

        System.out.println("Library Name: " + libraryName);
        System.out.println("Initial Books Available: " + library.booksAvailable);

        library.issueBooks(5);
        library.returnBooks(2);
    }
}
