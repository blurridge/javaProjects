import javax.swing.*;  
import java.awt.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class MainWindow implements ActionListener {

    JFrame frame;
    ImageIcon logo;
    JPanel sideBar;
    JPanel greetingBar;
    JPanel tablePanel;
    ImageIcon temp;
    JLabel libraryLogo;
    JButton homeBtn;
    JButton addBtn;
    JButton deleteBtn;
    JButton forceSaveBtn;
    JButton forceLoadBtn;
    JButton quitBtn;
    JLabel timeNow;
    JLabel greeting;
    DefaultTableModel bookTableModel;
    JTable bookTable;
    JTable rowTable;
    JScrollPane tablePane;
    
    private static String[] greetingList = {"Heya!",
    "Hey there!",
    "How are things?",
    "What's new?",
    "It's good to see you!",
    "G'day!",
    "Howdy!",
    "What's up?",
    "How's it going?",
    "What's happening?",
    "What's the story?",
    "Yo!",
    "Hello!",
    "Hi there!",
    "It's nice to meet you!",
    "It's a pleasure to meet you!"};

    protected static String[][] bookData = new String[100][7];

    MainWindow() {

        int currIdx = (int) (Math.random() * 16.0);
        String currentGreeting = greetingList[currIdx];
        final DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Calendar now = Calendar.getInstance();

        frame = new JFrame();
        frame.setTitle("Cebu City Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(900, 550);
        frame.setLayout(null);

        logo = new ImageIcon("library_logo.png");
        frame.setIconImage(logo.getImage());
        frame.getContentPane().setBackground(new Color(255, 255, 255));

        sideBar = new JPanel();
        sideBar.setLayout(null);
        sideBar.setBackground(new Color(54, 54, 54));
        sideBar.setBounds(0, 0, 136, 550);

        greetingBar = new JPanel();
        greetingBar.setBackground(new Color(88, 88, 88));
        greetingBar.setBounds(136, 0, 764, 73);
        greetingBar.setLayout(null);

        tablePanel = new JPanel();
        tablePanel.setBackground(new Color(255, 255, 255));
        tablePanel.setBounds(136, 73, 764, 477);
        tablePanel.setLayout(null);
        
        libraryLogo = new JLabel(logo);
        libraryLogo.setBounds(29, 2, 79, 79);
        
        homeBtn = new JButton();
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        homeBtn.setForeground(Color.WHITE);
        homeBtn.setOpaque(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.setBorderPainted(false);
        homeBtn.setFocusPainted(false);
        homeBtn.setBounds(25, 102, 80, 15);
        homeBtn.addActionListener(this);
        homeBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        addBtn = new JButton();
        addBtn.setText("Add Books");
        addBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        addBtn.setForeground(Color.WHITE);
        addBtn.setOpaque(false);
        addBtn.setContentAreaFilled(false);
        addBtn.setBorderPainted(false);
        addBtn.setFocusPainted(false);
        addBtn.setBounds(15, 154, 105, 15);
        addBtn.addActionListener(this);
        addBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        deleteBtn = new JButton();
        deleteBtn.setText("Delete Books");
        deleteBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        deleteBtn.setForeground(Color.WHITE);
        deleteBtn.setOpaque(false);
        deleteBtn.setContentAreaFilled(false);
        deleteBtn.setBorderPainted(false);
        deleteBtn.setFocusPainted(false);
        deleteBtn.setBounds(1, 206, 130, 15);
        deleteBtn.addActionListener(this);
        deleteBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        forceSaveBtn = new JButton();
        forceSaveBtn.setText("Force Save");
        forceSaveBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        forceSaveBtn.setForeground(Color.WHITE);
        forceSaveBtn.setOpaque(false);
        forceSaveBtn.setContentAreaFilled(false);
        forceSaveBtn.setBorderPainted(false);
        forceSaveBtn.setFocusPainted(false);
        forceSaveBtn.setBounds(10, 300, 115, 15);
        forceSaveBtn.addActionListener(this);
        forceSaveBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        forceLoadBtn = new JButton();
        forceLoadBtn.setText("Force Load");
        forceLoadBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        forceLoadBtn.setForeground(Color.WHITE);
        forceLoadBtn.setOpaque(false);
        forceLoadBtn.setContentAreaFilled(false);
        forceLoadBtn.setBorderPainted(false);
        forceLoadBtn.setFocusPainted(false);
        forceLoadBtn.setBounds(10, 350, 115, 15);
        forceLoadBtn.addActionListener(this);
        forceLoadBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        quitBtn = new JButton();
        quitBtn.setText("Quit");
        quitBtn.setFont(new Font("Arial", Font.PLAIN, 15));
        quitBtn.setForeground(Color.WHITE);
        quitBtn.setOpaque(false);
        quitBtn.setContentAreaFilled(false);
        quitBtn.setBorderPainted(false);
        quitBtn.setFocusPainted(false);
        quitBtn.setBounds(10, 400, 115, 15);
        quitBtn.addActionListener(this);
        quitBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        timeNow = new JLabel(dateFormat.format(now.getTime()));
        timeNow.setFont(new Font("Arial", Font.PLAIN, 12));
        timeNow.setForeground(Color.WHITE);
        timeNow.setBounds(10, 470, 115, 15);

        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calendar now = Calendar.getInstance();
                timeNow.setText(dateFormat.format(now.getTime()));
            }
        }).start();

        greeting = new JLabel();
        greeting.setText(currentGreeting);
        greeting.setFont(new Font("Arial", Font.BOLD, 24));
        greeting.setForeground(Color.WHITE);
        greeting.setBounds(30, 15, 500, 50);

        generateData();
        String[] header = {"TITLE", "AUTHOR", "BORROWED STATUS", "BORROWER NAME", "BORROWER TYPE", "RETURN DATE", "MATERIAL TYPE"};
        bookTableModel = new DefaultTableModel(bookData, header);
        bookTable = new JTable(bookTableModel);
        bookTable.setEnabled(false);
        bookTable.setBounds(0, 0, 750, 442);
        rowTable = new RowNumberTable(bookTable);
        tablePane = new JScrollPane(bookTable);
        tablePane.setRowHeaderView(rowTable);
        tablePane.setCorner(JScrollPane.UPPER_LEFT_CORNER, rowTable.getTableHeader());
        tablePane.setBounds(bookTable.getBounds());
        tablePane.setViewportView(bookTable);

        frame.add(sideBar);
        frame.add(greetingBar);
        frame.add(tablePanel);
        sideBar.add(libraryLogo);
        sideBar.add(homeBtn);
        sideBar.add(addBtn);
        sideBar.add(deleteBtn);
        sideBar.add(forceSaveBtn);
        sideBar.add(forceLoadBtn);
        sideBar.add(quitBtn);
        sideBar.add(timeNow);
        greetingBar.add(greeting);
        tablePanel.add(tablePane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }

    public static void generateData() {
        for(int i = 0; i < LibrarianApp.matCount; i++) {
            bookData[i][0] = LibrarianApp.readingMats[i].getTitle();
            bookData[i][1] = LibrarianApp.readingMats[i].getAuthor();
            bookData[i][2] = String.valueOf(LibrarianApp.readingMats[i].getBorrowedStatus());
            bookData[i][3] = LibrarianApp.readingMats[i].getBorrowerName();
            bookData[i][4] = LibrarianApp.readingMats[i].getBorrowerType();
            bookData[i][5] = LibrarianApp.readingMats[i].getReturnDate();
            bookData[i][6] = LibrarianApp.readingMats[i].getMatType();
        }
    }

    public static void deleteData(int index) {
        for(int i = index; i < LibrarianApp.matCount + 1; i++) {
            bookData[i+1][0] = bookData[i][0];
            bookData[i] = bookData[i + 1];
            Arrays.fill(bookData[i+1], null);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == homeBtn) {
            frame.dispose();
            new MainWindow();
        }
        if(e.getSource() == addBtn) {
            AddBookWindow currAdd = new AddBookWindow();
            if(!currAdd.getTitle().equals("") && !currAdd.getAuthor().equals("")) {
                LibrarianApp.addReadingMats(currAdd.getTitle(), currAdd.getAuthor());
                generateData();
                bookTableModel.insertRow(LibrarianApp.matCount - 1, new Object[]{currAdd.getTitle(), currAdd.getAuthor(), "false", "N/A", "N/A", "N/A", "Book"});
            }
        }
        if(e.getSource() == deleteBtn) {
            DeleteBookWindow currDel = new DeleteBookWindow();
            if(currDel.getToDelete() > -1) {
                LibrarianApp.removeReadingMats(currDel.getToDelete());
                deleteData(currDel.getToDelete());
                bookTableModel.removeRow(currDel.getToDelete());
            }
        }
        if(e.getSource() == forceSaveBtn) {
            LibrarianApp.saveReadingMats();
        }
        if(e.getSource() == forceLoadBtn) {
            LibrarianApp.loadReadingMats();
        }
        if(e.getSource() == quitBtn) {
            System.exit(0);
        }
    }
}
