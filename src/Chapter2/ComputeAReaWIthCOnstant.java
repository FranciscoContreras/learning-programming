package Chapter2;
import java.util.Scanner;

public class ComputeAReaWIthCOnstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Dec;are a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * PI;

        // Display the result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
