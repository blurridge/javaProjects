public class ArraySwap {
    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] secondArr = {9, 10, 11, 12, 13, 14, 15, 16};
        arrSwap(firstArr, secondArr);
        System.out.print("First array: ");
        for(int n : firstArr)
            System.out.print(n + " ");
        System.out.print("\nSecond array: ");
        for(int n : secondArr)
            System.out.print(n + " ");
    }
    
    public static void arrSwap(int[] firstArr, int[] secondArr) {
        for(int i = 0; i < firstArr.length; i++){
            int temp = firstArr[i];
            firstArr[i] = secondArr[i];
            secondArr[i] = temp;
        }
    }
}
