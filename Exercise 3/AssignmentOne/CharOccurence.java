/* ================================================================
FILENAME    :CharOccurence.java
DESCRIPTION :Create a program that asks for sentence input and prints
            the number of occurences per character.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Scanner;

public class CharOccurence {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String userSentence, noDupe;
        System.out.print("Enter a sentence: ");
        userSentence = userInput.nextLine();
        int[] numOccurences = countOccurences(userSentence);
        int[] hashUsedChars = new int[127];
        // TODO: Check if exclamation point is not included and if letters with different cases should be counted the same
        for(int i = 0; i < userSentence.length(); i++){
            if(!Character.isWhitespace(userSentence.charAt(i)) && hashUsedChars[(int) userSentence.charAt(i)] == 0){
                hashUsedChars[(int) userSentence.charAt(i)]++;
                System.out.println(userSentence.charAt(i) + " - " + numOccurences[(int) userSentence.charAt(i)]);
            }
        }
    }

    public static int[] countOccurences(String sentence) {
        int[] occurences = new int[127];
        for (int i = 0; i < sentence.length(); i++) {
            occurences[(int) sentence.charAt(i)]++;
        }
        return occurences;
    }
}
