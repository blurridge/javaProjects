/* ======================================================
FILENAME    :CheckLeapYear.java
DESCRIPTION :Create a program that asks for a year and
            displays whether it is a leap year or not.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {

        int year;
        boolean isLeapYear;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = userInput.nextInt();
        while(year < 1000 || year > 9999){
            System.out.println("Invalid year. Please try again.");
            System.out.print("Enter the year: ");
            year = userInput.nextInt();
        }
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if(isLeapYear){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}