/* ======================================================
FILENAME    :FindChineseZodiac.java
DESCRIPTION :Create a program that asks for a year and
            displays its Chinese Zodiac.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class FindChineseZodiac {
    public static void main(String[] args) {

        int year, yearModulo;
        String zodiacSign = null;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = userInput.nextInt();
        while(year < 1000 || year > 9999){
            System.out.println("Invalid year. Please try again.");
            System.out.print("Enter the year: ");
            year = userInput.nextInt();
        }
        yearModulo = year % 12;
        switch(yearModulo){
            case 0:
                zodiacSign = "monkey";
                break;
            case 1:
                zodiacSign = "rooster";
                break;
            case 2:
                zodiacSign = "dog";
                break;
            case 3:
                zodiacSign = "pig";
                break;
            case 4:
                zodiacSign = "rat";
                break;
            case 5:
                zodiacSign = "ox";
                break;
            case 6:
                zodiacSign = "tiger";
                break;
            case 7:
                zodiacSign = "rabbit";
                break;
            case 8:
                zodiacSign = "dragon";
                break;
            case 9:
                zodiacSign = "snake";
                break;
            case 10:
                zodiacSign = "horse";
                break;
            case 11:
                zodiacSign = "sheep";
                break;
        }
        System.out.println(year + " has the sign " + zodiacSign + ".");
    }
}