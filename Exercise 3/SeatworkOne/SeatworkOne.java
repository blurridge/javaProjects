/* ================================================================
FILENAME    :SeatworkOne.java
DESCRIPTION :Create an array of 20 elements, populate it with 
            random integers, pass it to 2 methods, one that reverses 
            the contents of the array and returns the reversed array, 
            and one that sorts the contents of the array and returns 
            the sorted array. Both methods should NOT modify the 
            original array passed.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 28, 2022
=================================================================== */

public class SeatworkOne {
    public static void main(String[] args) {
        int[] randomNum = new int[20];
        int[] reversedArr = new int[20];
        int[] sortedArr = new int[20];

        for(int i = 0; i < randomNum.length; i++) { 
            randomNum[i] = (int)(Math.random() * 100);
            reversedArr[i] = randomNum[i]; // Generates random numbers and stores the same copy to reversedArr and sortedArr
            sortedArr[i] = randomNum[i];
        }

        System.out.print("Base array: ");
        for(int n : randomNum)
            System.out.print(n + " ");

        reversedArr = reverseArray(reversedArr);
        System.out.print("\nReversed array: ");
        for(int n : reversedArr)
            System.out.print(n + " ");

        sortedArr = sortArray(sortedArr);
        System.out.print("\nSorted array: ");
        for(int n : sortedArr)
            System.out.print(n + " ");

        System.out.print("\nProof of base array unmutated: ");
        for(int n : randomNum)
            System.out.print(n + " ");
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = array;
        for(int i = 0; i < reversedArray.length / 2; i++) { // Goes up to half of the array for optimization
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[reversedArray.length - 1 - i];
            reversedArray[reversedArray.length - 1 - i] = temp;
        }
        return reversedArray;
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = array;
        for(int i = 0; i < sortedArray.length - 1; i++){ // Bubble sort with flag implementation
            boolean swapped = false;
            for(int j = 0; j < sortedArray.length - i - 1; j++){ // Assumes i elements are sorted already
                if(sortedArray[j] > sortedArray[j + 1]){
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) // Breaks loop if no swaps occurred. That means array is sorted.
                break;
        }
        return sortedArray;
    }
}