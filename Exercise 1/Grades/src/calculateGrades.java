/* ======================================================
FILENAME    :calculateGrades.java
DESCRIPTION :Create a program that asks for 5 grades and
            displays their average.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 10, 2022
======================================================= */

import java.util.Scanner;

public class calculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade, average;
        System.out.print("Enter Grade #1: ");
        firstGrade = input.nextDouble();
        System.out.print("Enter Grade #2: ");
        secondGrade = input.nextDouble();
        System.out.print("Enter Grade #3: ");
        thirdGrade = input.nextDouble();
        System.out.print("Enter Grade #4: ");
        fourthGrade = input.nextDouble();
        System.out.print("Enter Grade #5: ");
        fifthGrade = input.nextDouble();
        average = (firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade) / 5.0;
        System.out.println("Your average is: " + average);
    }
}