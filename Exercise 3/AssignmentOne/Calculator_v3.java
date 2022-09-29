/* ================================================================
FILENAME    :Calculator_v3.java
DESCRIPTION :Create a Calculator class containing the methods of 
            adding, subtracting, multiplying and dividing two 
            doubles. Also asks the user for the operator.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 29, 2022
=================================================================== */

import java.util.Scanner;

public class Calculator_v3 {
    public static void main(String[] args) {
        double firstValue, secondValue;
        String operator;
        Double result = Double.NaN;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Calculator v3");
        System.out.print("Enter the first number: ");
        firstValue = userInput.nextDouble();
        System.out.print("Enter an operator: ");
        operator = userInput.next();
        System.out.print("Enter the second number: ");
        secondValue = userInput.nextDouble();
        switch(operator){
            case "+":
                result = addTwoNumbers(firstValue, secondValue);
                break;
            case "-":
                result = subtractTwoNumbers(firstValue, secondValue);
                break;
            case "x":
                result = multiplyTwoNumbers(firstValue, secondValue);
                break;
            case "/":
                result = divideTwoNumbers(firstValue, secondValue);
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
        if(Double.isNaN(result)){
            System.out.println("Calculation failed!");
        }
        else{
            if(operator.equals("+"))
                System.out.printf("The sum is %.2f.", result);
            else if(operator.equals("-"))
                System.out.printf("The difference is %.2f.", result);
            else if(operator.equals("x"))
                System.out.printf("The product is %.2f.", result);
            else if(operator.equals("/")) 
                System.out.printf("The quotient is %.2f.", result);
        }
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
