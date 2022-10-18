/* ================================================================
FILENAME    :LibraryApp.java
DESCRIPTION :Create a Library app that allows management of books, 
            users, and borrow records.
AUTHOR      :Zach Riane I. Machacon
CREATED     :October 17, 2022
=================================================================== */

import java.util.Scanner;

public class LibraryApp {
    private static Book[] books = new Book[100];
    private static User[] users = new User[100];
    private static BorrowRecord[] borrowRecords = new BorrowRecord[100];
    private static int bookCount;
    private static int userCount;
    private static int recordCount;

    public static void main(String[] args){
        System.out.println("Welcome to the Library App!");
        boolean continueProgram = true;
        while(continueProgram){
            int choice = displayMenu();

            while(choice < 1 || choice > 10){
                System.out.println("Invalid choice. Please try again.");
                choice = displayMenu();
            }

            switch(choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    addUser();
                    break;
                case 5:
                    editUser();
                    break;
                case 6:
                    deleteUser();
                    break;
                case 7:
                    borrowBook();
                    break;
                case 8:
                    returnBook();
                    break;
                case 9:
                    displayAll();
                    break;
                case 10:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.\n");
                    break;
            }
        }
    }

    public static int displayMenu() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("[1.] Add books");
        System.out.println("[2.] Edit books");
        System.out.println("[3.] Delete books");
        System.out.println("[4.] Add user");
        System.out.println("[5.] Edit user");
        System.out.println("[6.] Delete user");
        System.out.println("[7.] Borrow book");
        System.out.println("[8.] Return book");
        System.out.println("[9.] Display all books, users, and records");
        System.out.println("[10.] Quit");
        System.out.print("Enter your choice: ");
        int userChoice = userInput.nextInt();
        System.out.println();
        return userChoice;
    }

    private static void addBook() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String bookTitle = userInput.nextLine();
        System.out.print("Enter book author: ");
        String bookAuthor = userInput.nextLine();
        System.out.print("Enter book ISBN: ");
        long bookISBN = userInput.nextLong();
        Book currentBook = new Book(bookTitle, bookAuthor, bookISBN);
        if(bookCount + 1 >= books.length){
            System.out.println("[ERROR] Books are full!\n");
        }
        else{
            books[bookCount++] = currentBook;
            System.out.println("[SUCCESS] Book added!\n");
        }
    }

    private static void editBook() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("List of books: ");
        for(int i = 0; i < bookCount; i++){
            System.out.println(books[i]);
        }
        System.out.println();

        System.out.print("Enter book title you want to edit: ");
        String toEdit = userInput.nextLine();
        int bookIndex = -1;
        for(int i = 0; i < bookCount; i++){
            if(books[i].getBookTitle().equalsIgnoreCase(toEdit)){
                bookIndex = i;
                break;
            }
        }
        if(bookIndex != -1){
            boolean toEditOrNot = false;
            String editChoice;
            System.out.println("Would you like to edit " + books[bookIndex].getBookTitle() + "'s title? [y/n]");
            editChoice = userInput.nextLine();
            toEditOrNot = (editChoice.equalsIgnoreCase("y")) ? true : false;
            if(toEditOrNot){
                System.out.println("What should " + books[bookIndex].getBookTitle() + " be renamed to?");
                books[bookIndex].setBookTitle(userInput.nextLine());
                toEditOrNot = false;
            }
            System.out.println("Would you like to edit " + books[bookIndex].getBookTitle() + "'s author? [y/n]");
            editChoice = userInput.nextLine();
            toEditOrNot = (editChoice.equalsIgnoreCase("y")) ? true : false;
            if(toEditOrNot){
                System.out.println("Who is the new author of " + books[bookIndex].getBookTitle() + "?");
                books[bookIndex].setBookAuthor(userInput.nextLine());
                toEditOrNot = false;
            }
            System.out.println("Would you like to edit " + books[bookIndex].getBookTitle() + "'s ISBN? [y/n]");
            editChoice = userInput.nextLine();
            toEditOrNot = (editChoice.equalsIgnoreCase("y")) ? true : false;
            if(toEditOrNot){
                System.out.println("What is the new ISBN of " + books[bookIndex].getBookTitle() + "?");
                books[bookIndex].setBookISBN(userInput.nextLong());
                toEditOrNot = false;
            }
            System.out.println("[SUCCESS] Details of " + books[bookIndex].getBookTitle() + " has been updated!\n");
        }
        else{
            System.out.println("[ERROR] Book does not exist.\n");
        }
    }

    private static void deleteBook() {
        System.out.println("List of books: ");
        for(int i = 0; i < bookCount; i++){
            System.out.println(books[i]);
        }
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter book title to be deleted: ");
        String bookTitle = userInput.nextLine();
        for(int i = 0; i < bookCount; i++){
            if(bookTitle.equalsIgnoreCase(books[i].getBookTitle())){
                for(int j = i; j < bookCount - 1; j++){
                    books[j] = books[j + 1];
                }
                bookCount--;
                System.out.println("[SUCCESS] Book successfully deleted!\n");
                return;
            }
        }
        System.out.println("[ERROR] Book title not found.\n");
    }

    private static void addUser() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String userName = userInput.nextLine();
        System.out.print("Enter mobile number: ");
        long mobileNumber = userInput.nextLong();
        userInput.nextLine();
        System.out.print("Enter user address: ");
        String userAddress = userInput.nextLine();
        User currentUser = new User(userName, mobileNumber, userAddress);
        if(userCount + 1 >= users.length){
            System.out.println("[ERROR] Users are full!\n");
        }
        else{
            users[userCount++] = currentUser;
            System.out.println("[SUCCESS] User added!\n");
        }
    }

    private static void editUser() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("List of users: ");
        for(int i = 0; i < userCount; i++){
            System.out.println(users[i]);
        }
        System.out.println();

        System.out.print("Enter user you want to edit: ");
        String toEdit = userInput.nextLine();
        int userIndex = -1;
        for(int i = 0; i < userCount; i++){
            if(users[i].getUserName().equalsIgnoreCase(toEdit)){
                userIndex = i;
                break;
            }
        }
        if(userIndex != -1){
            boolean toEditOrNot = false;
            String editChoice;
            System.out.println("Would you like to edit " + users[userIndex].getUserName() + "'s name? [y/n]");
            editChoice = userInput.nextLine();
            toEditOrNot = (editChoice.equalsIgnoreCase("y")) ? true : false;
            if(toEditOrNot){
                System.out.println("What is " + users[userIndex].getUserName() + "'s new name?");
                users[userIndex].setUserName(userInput.nextLine());
                toEditOrNot = false;
            }
            System.out.println("Would you like to edit " + users[userIndex].getUserName() + "'s mobile number? [y/n]");
            editChoice = userInput.nextLine();
            toEditOrNot = (editChoice.equalsIgnoreCase("y")) ? true : false;
            if(toEditOrNot){
                System.out.println("Who is the new mobile number of " + users[userIndex].getUserName() + "?");
                users[userIndex].setMobileNumber(userInput.nextLong());
                userInput.nextLine();
                toEditOrNot = false;
            }
            System.out.println("Would you like to edit " + users[userIndex].getUserName() + "'s address? [y/n]");
            editChoice = userInput.nextLine();
            toEditOrNot = (editChoice.equalsIgnoreCase("y")) ? true : false;
            if(toEditOrNot){
                System.out.println("What is the new address of " + users[userIndex].getUserName() + "?");
                users[userIndex].setUserAddress(userInput.nextLine());
                toEditOrNot = false;
            }
            System.out.println("[SUCCESS] Details of " + users[userIndex].getUserName() + " has been updated!\n");
        }
        else{
            System.out.println("[ERROR] User does not exist.\n");
        }
    }

    private static void deleteUser() {
        System.out.println("List of users: ");
        for(int i = 0; i < userCount; i++){
            System.out.println(users[i]);
        }
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter user name to be deleted: ");
        String userName = userInput.nextLine();
        for(int i = 0; i < userCount; i++){
            if(userName.equalsIgnoreCase(users[i].getUserName())){
                for(int j = i; j < userCount - 1; j++){
                    users[j] = users[j + 1];
                }
                userCount--;
                System.out.println("[SUCCESS] User successfully deleted!\n");
                return;
            }
        }
        System.out.println("[ERROR] User not found.\n");
    }

    private static void borrowBook() {
        System.out.println("List of books: ");
        for(int i = 0; i < bookCount; i++){
            System.out.println(books[i]);
        }
        System.out.println();

        System.out.println("List of users: ");
        for(int i = 0; i < userCount; i++){
            System.out.println(users[i]);
        }
        System.out.println();
 
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter borrower name: ");
        String borrowerName = userInput.nextLine();
        boolean userExists = false;
        for(int i = 0; i < userCount; i++){
            if(borrowerName.equalsIgnoreCase(users[i].getUserName())){
                userExists = true;
                break;
            }
        }
        if(userExists){
            System.out.print("Enter book title to be borrowed: ");
            String bookTitle = userInput.nextLine();
            boolean bookExists = false, bookBorrowed = false;
            for(int i = 0; i < bookCount; i++){
                if(bookTitle.equalsIgnoreCase(books[i].getBookTitle())){
                    bookExists = true;
                    break;
                }
            }
            for(int i = 0; i < recordCount; i++){
                if(bookTitle.equalsIgnoreCase(borrowRecords[i].getBookTitle())){
                    bookBorrowed = true;
                    break;
                }
            }
            if(bookExists && !bookBorrowed){
                BorrowRecord currentBorrower = new BorrowRecord(borrowerName, bookTitle);
                if(recordCount + 1 >= borrowRecords.length){
                    System.out.println("[ERROR] Records are full!\n");
                }
                else{
                    borrowRecords[recordCount++] = currentBorrower;
                    System.out.println("[SUCCESS] Borrower recorded!\n");
                }
            }
            else{
                System.out.println("[ERROR] Book entered does not exist or book is currently borrowed.\n");
            }
        }
        else{
            System.out.println("[ERROR] User does not exist. Please register first to borrow.\n");
        }
    }

    private static void returnBook() {
        System.out.println("List of borrowers: ");
        for(int i = 0; i < recordCount; i++){
            System.out.println(borrowRecords[i]);
        }
        System.out.println();

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter borrower name: ");
        String borrowerName = userInput.nextLine();
        System.out.print("Enter book title to be returned: ");
        String bookTitle = userInput.nextLine();
        for(int i = 0; i < recordCount; i++){
            if(borrowerName.equalsIgnoreCase(borrowRecords[i].getBorrowerName()) && bookTitle.equalsIgnoreCase(borrowRecords[i].getBookTitle())){
                for(int j = i; j < recordCount - 1; j++){
                    borrowRecords[j] = borrowRecords[j + 1];
                }
                recordCount--;
                System.out.println("[SUCCESS] Book successfully returned!\n");
                return;
            }
        }
        System.out.println("[ERROR] Borrower name or book title not found.\n");
    }

    private static void displayAll() {
        System.out.println("List of books: ");
        for(int i = 0; i < bookCount; i++){
            System.out.println(books[i]);
        }
        System.out.println();

        System.out.println("List of users: ");
        for(int i = 0; i < userCount; i++){
            System.out.println(users[i]);
        }
        System.out.println();

        System.out.println("List of borrowers: ");
        for(int i = 0; i < recordCount; i++){
            System.out.println(borrowRecords[i]);
        }
        System.out.println();
    }
}
