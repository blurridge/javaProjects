/* ================================================================
FILENAME    :Book.java
DESCRIPTION :Create a class that contains attributes and methods
            for the class, Book.
AUTHOR      :Zach Riane I. Machacon
CREATED     :October 17, 2022
=================================================================== */

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private long bookISBN;

    public Book() {
        this.bookTitle = "";
        this.bookAuthor = "";
    }

    public Book(String bookTitle, String bookAuthor, long bookISBN) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public long getBookISBN() {
        return this.bookISBN;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookISBN(long bookISBN){
        this.bookISBN = bookISBN;
    }

    public String toString() {
        String bookString = "\nBook title: " + this.bookTitle + "\nBook author: " + this.bookAuthor + "\nBook ISBN: " + this.bookISBN;
        return bookString;
    }
}
