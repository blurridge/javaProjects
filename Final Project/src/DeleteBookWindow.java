import javax.swing.*; 

public class DeleteBookWindow {

    private int toDelete = -1;

    DeleteBookWindow() throws NumberFormatException {
        while(this.toDelete == -1) {
            JTextField index = new JTextField();
            Object[] fields = {
                "Index: ", index
            };
            int option = JOptionPane.showConfirmDialog(null, fields, "Delete Book", JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                try {
                    int currentIdx = Integer.parseInt(index.getText()) - 1;
                    if(currentIdx >= 0 && currentIdx < LibrarianApp.matCount) {
                        this.toDelete = currentIdx;
                        JOptionPane.showMessageDialog(null, LibrarianApp.readingMats[currentIdx].getTitle() + " has been deleted successfully!", 
                        "[SUCCESS] Book Deleted Successfully", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid index.", "[ERROR] Invalid Index", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid index.", "[ERROR] Invalid Index", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                break;
            }
        }
    }

    public int getToDelete() {
        return this.toDelete;
    }
}
