package Chapter2.Exercises;
import java.util.Scanner;

public class SquareMeterToPing {
public static void main (String[] args) {
    // Create scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter value
    System.out.print("Enter a number in square meters: ");

    double squareMeters = input.nextDouble();

    // Compute for pings
    double pings = squareMeters * 0.3025;

    // Display results
    System.out.println(squareMeters + " square meters is " + pings + " pings");
}
}
