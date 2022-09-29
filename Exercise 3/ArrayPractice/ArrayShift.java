public class ArrayShift {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shiftLeft(arr, 2);
        for(int n : arr){
            System.out.print(n + " ");
        }
    }

    public static void shiftLeft(int[] arr){
        int firstElement = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    public static void shiftLeft(int[] arr, int byHowMuch){
        int[] firstElements = new int[byHowMuch];
        int j = 0;
        for(int i = 0; i < byHowMuch; i++){
            firstElements[i] = arr[i]; // Stores the first nth elements
        }
        for(int i = 0; i < arr.length - byHowMuch; i++){
            arr[i] = arr[i + byHowMuch]; // Moves the elements after the first nth elements
        }
        for(int i = arr.length - byHowMuch; i < arr.length; i++){
            arr[i] = firstElements[j]; // Places in first elements starting from the limit of previous for loop
            j++; // Increments counter for firstElements
        }
    }
}