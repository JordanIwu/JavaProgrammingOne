package Chapter2;

import java.util.Scanner;

/**
 * Finds the price of food and the tip for the waiter, the tip and the subtotal
 * is entered in by the user.
 *
 * @author Jordan Iwuchukwu
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Subtotal and Gratuity Rate ");
        double Subtotal = input.nextDouble();
        double GratuityRate = input.nextDouble();
        double Total = Subtotal * GratuityRate / 100 + Subtotal;
        double Gratuity = Total - Subtotal;
        System.out.println("The gratuity is " + Gratuity);
        System.out.print("The Total Is ");
        System.out.println(Gratuity + Subtotal);
    }
}
