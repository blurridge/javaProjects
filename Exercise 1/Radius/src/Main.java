import java.util.Scanner;

public class Main {
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