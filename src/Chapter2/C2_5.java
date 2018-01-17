
package Chapter2;

/**
 *Finds the price of food and the tip for the waiter, the tip and the subtotal is
 * entered in by the user.
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;

public class C2_5 {
    public static void main(String[] args) {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

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
