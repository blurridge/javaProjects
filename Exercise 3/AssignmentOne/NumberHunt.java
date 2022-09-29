/* ================================================================
FILENAME    :NumberHunt.java
DESCRIPTION :Create an array of 50 random integers from 1 - 99. Show
            whether the number exists in the array, the index it is
            found, and the whole array.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Random;
import java.util.Scanner;

public class NumberHunt {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner userInput = new Scanner(System.in);
        int[] randomNumbers = new int[50];
        int min = 1, max = 100, userNum, indexFound;
        boolean numberExists;
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = rand.nextInt((max - min) + 1) + min;
        }
        System.out.print("Enter a number: ");
        userNum = userInput.nextInt();
        numberExists = doesNumberExist(userNum, randomNumbers);
        indexFound = findIndex(userNum, randomNumbers);
        if(numberExists){
            System.out.println(userNum + " already exists in the array.");
            System.out.println(userNum + " is in index " + indexFound + ".");
        }
        else{
            System.out.println(userNum + " does not exist in the array and has no index.");
        }
        System.out.print("Array: ");
        for(int n : randomNumbers){
            System.out.print(n + " ");
        }
    }

    public static boolean doesNumberExist(int userNum, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNum) {
                return true;
            }
        }
        return false;
    }

    public static int findIndex(int userNum, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userNum) {
                return i;
            }
        }
        return -1;
    }
}
