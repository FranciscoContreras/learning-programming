package Chapter2.Exercises;
import java.util.Scanner;

public class CalculateTips {
public static void main(String[] args){
    // Create Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user for values
    System.out.print("Enter the subtotal and gratuity rate: ");

    double total = input.nextDouble();
    double percentage = input.nextDouble();

    // Compute for tips
    double tips = ((percentage / 100) * total) + total ;
    double gratuity = (percentage / 100) * total;

    // Display result
    System.out.println("The gratuity is $" + gratuity + " and total is $" + tips);

}
}
