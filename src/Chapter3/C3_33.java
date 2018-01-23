package Chapter3;

import java.util.Scanner;

/**
 * Compares the cost between different packages or the same product based off of
 * weight and price
 *
 * @author Jordan Iwuchukwu
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight and price for package 1");
        double Weight1 = input.nextDouble();
        double Price1 = input.nextDouble();
        System.out.println("Enter the weight and price for package 2");
        double Weight2 = input.nextDouble();
        double Price2 = input.nextDouble();
        double Average1 = (Price1 / Weight1);
        double Average2 = (Price2 / Weight2);
        if (Average1 < Average2) {
            System.out.println("Package 1 has a better price.");
        }
        if (Average2 < Average1) {
            System.out.println("Package 2 has a better price.");
        }

    }
}
