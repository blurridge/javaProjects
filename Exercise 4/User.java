/* ================================================================
FILENAME    :User.java
DESCRIPTION :Create a class that contains attributes and methods
            for the class, User.
AUTHOR      :Zach Riane I. Machacon
CREATED     :October 17, 2022
=================================================================== */

public class User {
    private String userName;
    private long mobileNumber;
    private String userAddress;

    public User(){
        this.userName = "";
        this.userAddress = "";
    }

    public User(String userName, long mobileNumber, String userAddress) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.userAddress = userAddress;
    }

    public String getUserName(){
        return this.userName;
    }

    public long getMobileNumber(){
        return this.mobileNumber;
    }

    public String getUserAddress(){
        return this.userAddress;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String toString() {
        String userString = "\nUser name: " + this.userName + "\nMobile number: " + this.mobileNumber + "\nUser address: " + this.userAddress;
        return userString;
    }
}
