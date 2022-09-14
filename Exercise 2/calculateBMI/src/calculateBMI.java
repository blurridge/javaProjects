/* ======================================================
FILENAME    :calculateBMI.java
DESCRIPTION :Create a program that computes the user's BMI
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class calculateBMI {
    public static void main(String[] args) {

        double userHeight, userWeight, heightMax = 2.10, heightMin = 1.30, weightMin = 40.0, weightMax = 500;
        double userBMI;
        // Max and min values are based on Filipino extremes.
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        userHeight = userInput.nextDouble();

        while(userHeight > heightMax || userHeight < heightMin){
            System.out.println("Invalid height. Please try again.");
            System.out.print("Enter your height in meters: ");
            userHeight = userInput.nextDouble();
        }

        System.out.print("Enter your weight in kilograms: ");
        userWeight = userInput.nextDouble();

        while(userWeight > weightMax || userWeight < weightMin){
            System.out.println("Invalid weight. Please try again.");
            System.out.print("Enter your weight in kilograms: ");
            userWeight = userInput.nextDouble();
        }

        userBMI = Math.round((userWeight / Math.pow(userHeight, 2)) * 10.0) / 10.0;
        System.out.println("Your BMI is: " + userBMI + ".");
    }
}