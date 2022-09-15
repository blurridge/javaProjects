/* ======================================================
FILENAME    :SumUntilZero.java
DESCRIPTION :Create a program that continously asks a
            number from a user and adds those values
            together until user enters zero.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        int userNum = -1, sum = 0;
        Scanner userInput = new Scanner(System.in);
        while(userNum != 0){
            System.out.print("Enter a number: ");
            userNum = userInput.nextInt();
            sum += userNum;
        }
        System.out.println("The sum of your given numbers is " + sum + ".");
    }
}