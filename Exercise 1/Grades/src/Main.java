import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade, sum = 0, average;
        for(int i = 0; i < 5; i++){
            System.out.print("Enter grade #" + (i+1) + ": ");
            grade = input.nextDouble();
            sum += grade;
        }
        average = sum / 5;
        System.out.println("Your average is: " + average);
    }
}