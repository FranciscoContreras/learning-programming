package Chapter2;
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt use to enter purchase amount
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        //Compute for results
        double tax = purchaseAmount * 0.06;
        //Display results
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}
