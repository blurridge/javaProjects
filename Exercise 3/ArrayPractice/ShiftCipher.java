import java.util.Scanner;

// TODO: ERROR HANDLING FOR WRONG CHOICE. ALSO LOWERCASE MODECHOICE.

public class ShiftCipher {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean continueCipher = true;
        while(continueCipher) {
            System.out.print("Enter \"decode\" or \"encode\": ");
            String modeChoice = userInput.nextLine();
            System.out.print("Enter your word: ");
            String baseWord = userInput.nextLine();
            System.out.print("Enter the shift factor: ");
            int shiftFactor = userInput.nextInt();
            if(modeChoice.equals("decode")){
                String wordResult = decodeWord(baseWord, shiftFactor);
                System.out.println("Base word: " + baseWord + "\nShifted word: " + wordResult);
            }
            else if(modeChoice.equals("encode")){
                String wordResult = encodeWord(baseWord, shiftFactor);
                System.out.println("Base word: " + baseWord + "\nShifted word: " + wordResult);
            }
            else{
                System.out.println("Invalid mode. Please try again.");
            }
            userInput.nextLine();
        }
        userInput.close();
    }

    public static String encodeWord(String word, int shiftFactor) {
        char[] wordArr = word.toCharArray();
        char[] newWord = new char[wordArr.length];
        for(int i = 0; i < wordArr.length; i++) {
            if((wordArr[i] >= 'a' && wordArr[i] <= 'z') || (wordArr[i] >= 'A' && wordArr[i] <= 'Z')) {
                int shiftedAscii = (int) (wordArr[i]) + shiftFactor;
                int minAscii = (Character.isLowerCase(wordArr[i])) ? 97 : 65;
                int maxAscii = (Character.isLowerCase(wordArr[i])) ? 123 : 91;
                int newAscii = (shiftedAscii >= maxAscii) ? minAscii + (shiftedAscii - maxAscii) : shiftedAscii;
                newWord[i] = (char) newAscii;
            }
            else
                newWord[i] = wordArr[i];
        }
        String newString = String.valueOf(newWord);
        return newString;
    }

    public static String decodeWord(String word, int shiftFactor){
        char[] wordArr = word.toCharArray();
        char[] newWord = new char[wordArr.length];
        for(int i = 0; i < wordArr.length; i++) {
            if((wordArr[i] >= 'a' && wordArr[i] <= 'z') || (wordArr[i] >= 'A' && wordArr[i] <= 'Z')) {
                int shiftedAscii = (int) (wordArr[i]) - shiftFactor;
                int minAscii = (Character.isLowerCase(wordArr[i])) ? 96 : 64;
                int maxAscii = (Character.isLowerCase(wordArr[i])) ? 122 : 90;
                int newAscii = (shiftedAscii <= minAscii) ? maxAscii - (minAscii - shiftedAscii) : shiftedAscii;
                newWord[i] = (char) newAscii;
            }
            else
                newWord[i] = wordArr[i];
        }
        String newString = String.valueOf(newWord);
        return newString;
    }
}