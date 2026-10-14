public class Book {
    String title;
    String author;
    double price;
    static String publisher = "ABC Publications";

    Book(String bookTitle, String bookAuthor, double bookPrice) {
        title = bookTitle;
        author = bookAuthor;
        price = bookPrice;
    }

    void displayDetails() {
        String bookTitle = title;
        String bookAuthor = author;
        double bookPrice = price;

        System.out.println("Publisher: " + publisher);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: Rs. " + bookPrice);
    }

    public static void main(String[] args) {
        String title = "Java Programming";
        String author = "James";
        double price = 450.0;

        Book book = new Book(title, author, price);
        book.displayDetails();
    }
}
