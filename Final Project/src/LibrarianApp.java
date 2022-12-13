import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class LibrarianApp {
    
    private static int arrSize = 100;
    protected static ReadingMaterial[] readingMats = new ReadingMaterial[arrSize];
    private static int libCount = 0;
    private static int bookCount = 0;
    private static int newsCount = 0;
    private static int magCount = 0;
    private static int journCount = 0;
    protected static int matCount;
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        loadReadingMats();
        MainWindow mainGUI = new MainWindow();
    }

    public static void loadReadingMats() {
        File readingMatFile = new File("../data/readingmats.txt");
        Scanner fileReader;
        try {
            fileReader = new Scanner(readingMatFile);
        }
        catch(FileNotFoundException e) {
            System.out.println("[ERROR] Default reading material file not found. Creating...");
            return;
        }
        while(fileReader.hasNext()) {
            updateMatCount();
            String[] matDetails = fileReader.nextLine().split(";");
            String type = matDetails[0], title = matDetails[1], author = matDetails[2], borrowerName = matDetails[4];
            String borrowerType = matDetails[5], returnDate = matDetails[6];
            boolean borrowStatus = Boolean.parseBoolean(matDetails[3]);
            ReadingMaterial curr = null;
            if(type.equalsIgnoreCase("book")) {
                curr = new Book(title, author, borrowStatus, borrowerName, borrowerType, returnDate);
                bookCount++;
            }
            else if(type.equalsIgnoreCase("newspaper")) {
                curr = new Newspaper(title, author, borrowStatus, borrowerName, borrowerType, returnDate);
                newsCount++;
            }
            else if(type.equalsIgnoreCase("magazine")) {
                curr = new Magazine(title, author, borrowStatus, borrowerName, borrowerType, returnDate);
                magCount++;
            }
            else if(type.equalsIgnoreCase("journal")) {
                curr = new Journal(title, author, borrowStatus, borrowerName, borrowerType, returnDate);
                journCount++;
            }
            readingMats[matCount] = curr;
        }
        updateMatCount();
        fileReader.close();
        System.out.println("[SUCCESS] Loaded!");
    }

    public static void saveReadingMats() {
        updateMatCount();
        File readingMatFile = new File("../data/readingmats.txt");
        try{
            FileWriter fileWriter = new FileWriter(readingMatFile);
            for(int i = 0; i < matCount; i++) {
                fileWriter.write(readingMats[i].getSaveString() + "\n");
            }
            fileWriter.flush();
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println("[ERROR] Saving failed.");
        }
        System.out.println("[SUCCESS] Saved!");
    }

    public static void addReadingMats(String title, String author) {
        updateMatCount();
        Book currBook = new Book(title, author);
        bookCount++;
        readingMats[matCount] = currBook;
        System.out.println("[SUCCESS] Added reading material!");
        saveReadingMats();
        updateMatCount();
    }

    public static void removeReadingMats(int choice) {
        updateMatCount();
        String currType = readingMats[choice].getMatType();
        if(currType.equalsIgnoreCase("book")) {
            bookCount--;
        }
        if(currType.equalsIgnoreCase("newspaper")) {
            newsCount--;
        }
        if(currType.equalsIgnoreCase("journal")) {
            journCount--;
        }
        if(currType.equalsIgnoreCase("magazine")) {
            magCount--;
        }
        for(int i = choice; i < matCount - 1; i++){
            readingMats[i] = readingMats[i + 1];
            readingMats[i+1] = null;
        }
        System.out.println("[SUCCESS] Removed reading material!");
        saveReadingMats();
    }

    public static void updateMatCount() {
        matCount = bookCount + newsCount + magCount + journCount;
    }
}