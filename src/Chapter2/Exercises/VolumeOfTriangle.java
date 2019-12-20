package Chapter2.Exercises;
import java.util.Scanner;

public class VolumeOfTriangle {
    public static void main(String[] args){
        // Crete Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for length of the sides
        System.out.print("Enter length of the sides and height of the Equilateral: ");
        double length = input.nextDouble();

        double test1 = (Math.sqrt(3) / 4) * Math.pow(length, 2);

        // Compute for volume

        System.out.println("Test one: " + test1);
        double area = (((Math.sqrt(3)) / 4) * Math.pow(length, 2));

        double volume = area * length;

        //Display results
        System.out.println("The area is: " + area);
        System.out.println("The volume of the Triangular prism is: " + volume);
    }
}
