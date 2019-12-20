package Chapter2.Exercises;
import java.util.Scanner;

public class MetersToFeet {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a value
        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();

        // Compute for results
        double feet = meters * 3.2786;

        // Display Results
        System.out.println(meters + " meters is " + feet + " feet." );
    }
}
