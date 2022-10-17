/* ================================================================
FILENAME    :BorrowRecord.java
DESCRIPTION :Create a class that contains attributes and methods
            for the class, BorrowRecord.
AUTHOR      :Zach Riane I. Machacon
CREATED     :October 17, 2022
=================================================================== */

public class BorrowRecord {
    private String borrowerName;
    private String bookTitle;

    public BorrowRecord() {
        this.borrowerName = "";
        this.bookTitle = "";
    }

    public BorrowRecord(String borrowerName, String bookTitle) {
        this.borrowerName = borrowerName;
        this.bookTitle = bookTitle;
    }

    public String getBorrowerName() {
        return this.borrowerName;
    }
    
    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String toString() {
        String recordString = "\nBorrower name: " + this.borrowerName + "\nBook title: " + this.bookTitle;
        return recordString;
    }
}
