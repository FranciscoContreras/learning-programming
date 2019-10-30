package Chapter2.Exercises;
import java.util.Scanner;

public class KilometerToMile {
    public static void main(String[] args){
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Enter Miles
        System.out.print("Enter the amount of miles: ");
        int miles = input.nextInt();

        //Compute for miles
        double milesToKilometer = miles * 1.6;

        // Present results
        System.out.println(miles + " miles is " + (miles * 1.6) + " kilometers." );
    }
}
