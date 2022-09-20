/* ======================================================
FILENAME    :TuitionDouble.java
DESCRIPTION :Create a program that asks for a university's
            tuition and prints the number of years it takes
            to double the tuition.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class TuitionDouble {
    public static void main(String[] args) {

        double uniTuition, percentage, doubledTuition, tuitionIncrease;
        int year = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the university's tuition: PHP ");
        uniTuition = userInput.nextDouble();
        System.out.print("Enter the university's tuition increase rate: ");
        percentage = userInput.nextDouble();
        tuitionIncrease = 1.0 + (percentage / 100.0);
        doubledTuition = uniTuition * 2;
        System.out.print(tuitionIncrease);
        while(uniTuition < doubledTuition){
            year++;
            uniTuition *= tuitionIncrease;
        }
        System.out.println("The tuition will double after " + year + " year/s.");
    }
}