package Chapter6;

import java.util.Scanner;

/**
 * Transfers dollars into either Euros Pounds or Yen based on transfer rates
 * entered in by the user.
 *
 * @author Jordan Iwuchukwu
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Euros can a single dollar buy?");
        double Euros = input.nextDouble();
        System.out.println("How many Pounds can a single dollar buy?");
        double Pounds = input.nextDouble();
        System.out.println("How much Yen can a single dollar buy?");
        double Yen = input.nextDouble();
        double Dollars = 0;
        double Transfer = 0;
        char Currency;
        String YesNo = "";
        while (!YesNo.equals("NO")) {
            System.out.println("Enter how many dollars are you going to transfer");
            Dollars = input.nextDouble();

            System.out.println("Enter E to buy Euros, Y to buy Yen, or P to buy Pounds");
            Currency = input.next().charAt(0);
            if (Currency == 'E' || Currency == 'e') {
                Transfer = Euros;
                System.out.println("You will have " + Conversion(Dollars, Transfer) + "Euroes.");

            }
            if (Currency == 'P' || Currency == 'p') {
                Transfer = Pounds;
                System.out.println("You will have " + Conversion(Dollars, Transfer) + "Pounds.");

            }
            if (Currency == 'Y' || Currency == 'y') {

                Transfer = Yen;
                System.out.println("You will have  " + Conversion(Dollars, Transfer) + "Yen.");

            }

            do {
                System.out.println("Are there more conversions to perform? Yes or No?");
                YesNo = input.next().toUpperCase();
            } while (!"YES".equals(YesNo) && !"NO".equals(YesNo));
        }

    }

    /**
     *
     * @param d d is the dollars used in conversion of money
     * @param c is the conversion rate for a given currency
     * @return Returns the amount of money you are supposed to have in the new
     * currency
     */
    public static double Conversion(double d, double c) {

        double FinalResult = 0;
        double fee;
        if (d <= 100) {
            fee = d * 0.10;
            FinalResult = (d - fee) * c;
        } else if (100 < d) {
            fee = d * 0.05;
            FinalResult = (d - (d * 0.05)) * c;
        }
        return FinalResult;

    }
}
