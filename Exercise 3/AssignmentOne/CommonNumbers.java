/* ================================================================
FILENAME    :CommonNumbers.java
DESCRIPTION :Create two arrays of different sizes, both randomly 
            filled with numbers. Display only the numbers common to 
            both arrays. 
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

public class CommonNumbers {
    public static void main(String[] args) {
        int firstArrSize = (int) (Math.random() * 100);
        int secondArrSize = (int) (Math.random() * 100);
        int[] firstArr = new int[firstArrSize];
        int[] secondArr = new int[secondArrSize];

        for (int i = 0; i < firstArrSize; i++) {
            firstArr[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < secondArrSize; i++) {
            secondArr[i] = (int) (Math.random() * 100);
        }

        System.out.print("First Array: ");
        for(int n : firstArr){
            System.out.print(n +" ");
        }

        System.out.println();
        System.out.print("Second Array: ");
        for(int n : secondArr){
            System.out.print(n +" ");
        }

        sortArray(firstArr);
        sortArray(secondArr);
        int[] commonValues = commonValues(firstArr, secondArr);

        System.out.println();
        System.out.print("Common values: ");
        for(int n : commonValues){
            System.out.print(n +" ");
        }
    }

    public static int[] commonValues(int[] firstArr, int[] secondArr){
        int i = 0, j = 0, k = 0, maxSize = (firstArr.length > secondArr.length) ? firstArr.length : secondArr.length;
        int[] tempArray = new int[maxSize];
        while(i < firstArr.length && j < secondArr.length){
            if(firstArr[i] == secondArr[j]){
                tempArray[k] = firstArr[i];
                i++;
                j++;
                k++;
            }
            else if(firstArr[i] < secondArr[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] commonValues = new int[k];
        for(i = 0; i < commonValues.length; i++) {
            commonValues[i] = tempArray[i];
        }
        return commonValues;
    }

    public static void sortArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){ // Bubble sort with flag implementation
            boolean swapped = false;
            for(int j = 0; j < array.length - i - 1; j++){ // Assumes i elements are sorted already
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) // Breaks loop if no swaps occurred. That means array is sorted.
                break;
        }
    }
}
