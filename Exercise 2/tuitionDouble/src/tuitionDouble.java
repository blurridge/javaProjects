/* ======================================================
FILENAME    :tuitionDouble.java
DESCRIPTION :Create a program that asks for a university's
            tuition and prints the number of years it takes
            to double the tuition.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 14, 2022
======================================================= */

import java.util.Scanner;

public class tuitionDouble {
    public static void main(String[] args) {

        double uniTuition, doubledTuition;
        int year = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the university's tuition: PHP ");
        uniTuition = userInput.nextDouble();
        doubledTuition = uniTuition * 2;
        while(uniTuition < doubledTuition){
            year++;
            uniTuition *= 1.70;
        }
        System.out.println("The tuition will double after " + year + " year/s.");
    }
}