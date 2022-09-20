/* ======================================================
FILENAME    :CalculateGrades.java
DESCRIPTION :Create a program that asks for 5 grades and
            displays their average.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 10, 2022
======================================================= */

import java.util.Scanner;

public class CalculateGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade, sum = 0, average;
        int i;
        for(i = 0; i < 5; i++){
            System.out.print("Enter Grade #" + (i+1) + ": ");
            grade = input.nextDouble();
            sum += grade;
        }
        average = sum / 5.0;
        System.out.printf("Your average is: %.2f", average);
    }
}