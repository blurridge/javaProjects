/* ================================================================
FILENAME    :StringHunt.java
DESCRIPTION :Create a program that asks the user for a sentence. 
            Repeatedly ask the user for a word. For each word, 
            display whether that word appears in the sentence. 
            Stop the program once the user types "stop".
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Arrays;
import java.util.Scanner;

public class StringHunt {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = userInput.nextLine();
        String[] strArr = sentence.split(" ");
        boolean continueWordCheck = true;
        while(continueWordCheck) {
            System.out.print("Enter a word: ");
            String word = userInput.nextLine();
            boolean doesWordExist = Arrays.asList(strArr).contains(word);
            if(word.equals("stop")) {
                continueWordCheck = false;
            }
            if(doesWordExist) {
                System.out.println(word + " exists in the sentence.");
            }
            else{
                System.out.println(word + " does not exist in the sentence.");
            }
        }
    }
}
