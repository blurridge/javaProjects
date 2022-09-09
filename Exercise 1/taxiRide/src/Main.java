import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double flagDownRate, totalDistance, pricePerKm, totalFare;
        Scanner input = new Scanner(System.in);
        System.out.print("What is your flag down rate? ");
        flagDownRate = input.nextDouble();
        System.out.print("What is your total distance travelled? ");
        totalDistance = input.nextDouble();
        System.out.print("What is your price per kilometer? ");
        pricePerKm = input.nextDouble();
        totalFare = flagDownRate + (totalDistance * pricePerKm);
        System.out.println("Your total fare is PHP " + totalFare);
    }
}