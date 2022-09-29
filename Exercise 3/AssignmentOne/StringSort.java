/* ================================================================
FILENAME    :StringSort.java
DESCRIPTION :Create a program that asks the user for a sentence, 
            splits the sentence into an array of Strings, each 
            element containing one word and sorts the array, and 
            displays the words alphabetically.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userSentence;
        System.out.print("Enter a sentence: ");
        userSentence = userInput.nextLine();
        String[] sentenceArr = userSentence.split(" ");
        Arrays.sort(sentenceArr, String.CASE_INSENSITIVE_ORDER);
        for(String n : sentenceArr){
            System.out.print(n + " ");
        }
    }
}
