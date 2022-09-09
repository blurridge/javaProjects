import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double firstGrade, secondGrade, thirdGrade, fourthGrade, fifthGrade, average;
        System.out.print("Enter Grade #1: ");
        firstGrade = input.nextDouble();
        System.out.print("Enter Grade #2: ");
        secondGrade = input.nextDouble();
        System.out.print("Enter Grade #3: ");
        thirdGrade = input.nextDouble();
        System.out.print("Enter Grade #4: ");
        fourthGrade = input.nextDouble();
        System.out.print("Enter Grade #5: ");
        fifthGrade = input.nextDouble();
        average = (firstGrade + secondGrade + thirdGrade + fourthGrade + fifthGrade) / 5.0;
        System.out.println("Your average is: " + average);
    }
}