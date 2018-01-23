package Chapter2;

import java.util.Scanner;

/**
 * Finds the total, tax, and tip for a meal where the subtotals for the drink
 * meal and desert is entered in by the user.
 *
 * @author Jordan Iwuchukwu
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was the price of the meal ");
        double Meal = input.nextDouble();
        System.out.println("What was the price of the drink");
        double Drink = input.nextDouble();
        System.out.println("What was the price of the dessert");
        double Dessert = input.nextDouble();
        double Total = (Dessert + Drink + Meal);
        double Tax = (Total * .10);
        double PriceBeforeTip = (Tax + Total);
        double Tip = (PriceBeforeTip * .15);
        double Price = (Tax + Tip + Total);
        System.out.println("The cost of food was " + Total);
        System.out.println("The tax was " + Tax);
        System.out.println("The tip was " + Tip);
        System.out.println("The final total was " + Price);
    }
}
