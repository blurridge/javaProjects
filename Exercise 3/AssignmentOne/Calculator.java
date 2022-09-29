/* ================================================================
FILENAME    :Calculator.java
DESCRIPTION :Create a Calculator class containing the methods of 
            adding, subtracting, multiplying and dividing two 
            integers.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int firstValue, secondValue, sum, difference, product;
        double quotient;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Enter the first number: ");
        firstValue = userInput.nextInt();
        System.out.print("Enter the second number: ");
        secondValue = userInput.nextInt();
        sum = addTwoNumbers(firstValue, secondValue);
        difference = subtractTwoNumbers(firstValue, secondValue);
        product = multiplyTwoNumbers(firstValue, secondValue);
        quotient = divideTwoNumbers(firstValue, secondValue);
        System.out.println("The sum is " + sum + ".");
        System.out.println("The difference is " + difference + ".");
        System.out.println("The product is " + product + ".");
        System.out.printf("The quotient is %.2f.", quotient);
    }

    public static int addTwoNumbers(int firstValue, int secondValue) {
        return firstValue + secondValue;
    }

    public static int subtractTwoNumbers(int firstValue, int secondValue) {
        return firstValue - secondValue;
    }

    public static int multiplyTwoNumbers(int firstValue, int secondValue) {
        return firstValue * secondValue;
    }

    public static double divideTwoNumbers(int firstValue, int secondValue) {
        return (double) firstValue / (double) secondValue;
    }
}
