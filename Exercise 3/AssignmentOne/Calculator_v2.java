/* ================================================================
FILENAME    :Calculator_v2.java
DESCRIPTION :Create a Calculator class containing the methods of 
            adding, subtracting, multiplying and dividing two 
            doubles.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Scanner;

public class Calculator_v2 {
    public static void main(String[] args) {
        double firstValue, secondValue, sum, difference, product, quotient;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Calculator v2");
        System.out.print("Enter the first number: ");
        firstValue = userInput.nextDouble();
        System.out.print("Enter the second number: ");
        secondValue = userInput.nextDouble();
        sum = addTwoNumbers(firstValue, secondValue);
        difference = subtractTwoNumbers(firstValue, secondValue);
        product = multiplyTwoNumbers(firstValue, secondValue);
        quotient = divideTwoNumbers(firstValue, secondValue);
        System.out.printf("The sum is %.2f.", sum);
        System.out.printf("The difference is %.2f.", difference);
        System.out.printf("The product is %.2f.", product);
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

    public static double addTwoNumbers(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }

    public static double subtractTwoNumbers(double firstValue, double secondValue) {
        return firstValue - secondValue;
    }

    public static double multiplyTwoNumbers(double firstValue, double secondValue) {
        return firstValue * secondValue;
    }

    public static double divideTwoNumbers(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }
}
