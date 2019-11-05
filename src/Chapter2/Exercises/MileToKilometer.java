package Chapter2.Exercises;
import java.util.Scanner;

public class MileToKilometer {
    public static void main(String[] args){
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter Miles
        System.out.print("Enter the number of miles: ");
        int miles = input.nextInt();

        // Compute for Kilometers
        double milesToKilometer = miles * 1.6;

        // Display Results
        System.out.println(miles + " converted to Kilometers are: " + Math.round(milesToKilometer));
    }
}
