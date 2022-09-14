/* ======================================================
FILENAME    :numberGuessing.java
DESCRIPTION :Create a program that continuously asks the
            user for an number until it matches the
            randomly generated number and informs the user
            if it is higher or lower than the random value.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args) {

        int userGuess, randomNum = (int) (Math.random() * 100);
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your guess: " + randomNum);
        userGuess = userInput.nextInt();
        while(userGuess != randomNum){
            if(userGuess < randomNum)
                System.out.println("Your guess is too low. Try again.");
            else
                System.out.println("Your guess is too high. Try again.");
            System.out.print("Enter your guess: ");
            userGuess = userInput.nextInt();
        }
        System.out.println("Congratulations! You guessed " + randomNum + "!");
    }
}