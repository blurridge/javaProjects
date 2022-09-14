/* ======================================================
FILENAME    :lotteryWin.java
DESCRIPTION :Create a program that asks for two-digit
            number and displays the prize according to
            similarity to randomly-generated two-digit
            number.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class lotteryWin {
    public static void main(String[] args) {

        int upperBound = 99, lowerBound = 10, userNum;
        int range = (upperBound - lowerBound) + 1;
        int randomNum = (int)(Math.random() * range) + lowerBound;
        int userFirstDigit, userSecondDigit, randomFirstDigit, randomSecondDigit;
        double userWinnings;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        userNum = userInput.nextInt();
        while(userNum < 10 || userNum > 99){
            System.out.println("You did not enter a two-digit number. Please try again.");
            System.out.print("Enter a two-digit number: ");
            userNum = userInput.nextInt();
        }
        userFirstDigit = userNum % 10;
        userSecondDigit = (userNum / 10) % 10;
        randomFirstDigit = randomNum % 10;
        randomSecondDigit = (randomNum / 10) % 10;

        if(userNum == randomNum){
            userWinnings = 10000.00;
            System.out.println("You have won PHP " + userWinnings);
        } else if(userFirstDigit == randomSecondDigit && userSecondDigit == randomFirstDigit){
            userWinnings = 3000.00;
            System.out.println("You have won PHP " + userWinnings);
        } else if(userFirstDigit == randomFirstDigit || userSecondDigit == randomSecondDigit ||
                userFirstDigit == randomSecondDigit || userSecondDigit == randomFirstDigit){
            userWinnings = 1000.00;
            System.out.println("You have won PHP " + userWinnings);
        } else{
            System.out.println("You have lost.");
        }
    }
}