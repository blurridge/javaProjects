/* ======================================================
FILENAME    :calculatePerimeterAndArea.java
DESCRIPTION :Create a program that asks for a radius and
            display the perimeter and area of the circle.
AUTHOR      :Zach Riane I. Machacon
CREATED     :September 10, 2022
======================================================= */

import java.util.Scanner;

public class calculatePerimeterAndArea {
    public static void main(String[] args) {
        double radius, perimeter, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        System.out.println("The perimeter of the circle is " + perimeter + " units and the area is " + area + " square units.");
    }
}