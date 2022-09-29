/* ================================================================
FILENAME    :ArrayEquality.java
DESCRIPTION :Create a program that populates two arrays and checks
            if they are equal.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        int[] firstArr = new int[5], secondArr = new int[5];
        System.out.println("Fill in first array:");
        populateArray(firstArr);
        System.out.println("\nFill in second array:");
        populateArray(secondArr);
        boolean areArraysEqual = equals(firstArr, secondArr);
        if(areArraysEqual){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }
    
    public static void populateArray(int[] array){
        Scanner userInput = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter value #" + (i+1) + ": ");
            array[i] = userInput.nextInt();
        }
    }

    public static boolean equals(int[] firstArr, int[] secondArr){
        for(int i = 0; i < firstArr.length; i++){
            if(firstArr[i]!= secondArr[i]){
                return false;
            }
        }
        return true;
    }
}
