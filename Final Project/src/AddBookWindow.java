import javax.swing.*;  

public class AddBookWindow {
    
    private String title = "";
    private String author = "";

    AddBookWindow() {
        while(this.title.equals("") || this.author.equals(""))
        {
            JTextField title = new JTextField();
            JTextField author = new JTextField();
            Object[] fields = {
                "Title: ", title,
                "Author: ", author
            };
            int option = JOptionPane.showConfirmDialog(null, fields, "Add Book", JOptionPane.OK_CANCEL_OPTION);
            if(option == JOptionPane.OK_OPTION) {
                this.title = title.getText();
                this.author = author.getText();
                if(this.title.equals("") || this.author.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter valid book details.", "[ERROR] Invalid Book Data", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    JOptionPane.showMessageDialog(null, this.title + " has been added successfully!", "[SUCCESS] Book Added Successfully", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else {
                break;
            }
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
