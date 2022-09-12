/* ======================================================
FILENAME    :taxiRide.java
DESCRIPTION :Create a program that asks for flag down rate,
            total distance traveled, and price per
            kilometer, then display the total fare for
            the taxi ride.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 10, 2022
======================================================= */

import java.util.Scanner;

public class taxiRide {
    public static void main(String[] args) {
        double flagDownRate, totalDistance, pricePerKm, totalFare;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your flag down rate? ");
        flagDownRate = input.nextDouble();
        System.out.print("What is your total distance travelled? ");
        totalDistance = input.nextDouble();
        System.out.print("What is your price per kilometer? ");
        pricePerKm = input.nextDouble();
        totalFare = (double) Math.round((flagDownRate + (totalDistance * pricePerKm)) * 100)/100;
        System.out.println("Your total fare is PHP " + totalFare);
    }
}