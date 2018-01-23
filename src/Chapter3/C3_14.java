package Chapter3;

import java.util.Scanner;

/**
 * Has the user try to guess heads or tails while the program randomly selects
 * one or the other
 *
 * @author Jordan Iwuchukwu
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess heads (Enter 1) or tails(Enter 0).");
        double answer = input.nextDouble();
        double number = (int) (Math.random() * 2);
        if (answer == 1 && number == 1) {
            System.out.println("You entered heads and it was heads.");
        } else if (answer == 0 && number == 1) {
            System.out.println("You entered tails and it was heads.");
        }
        /* If it is heads one of the 1st 2 lines witll be printer out if it
        Isn't one of the last 2 will be printed out.
         */
        if (answer == 0 && number == 0) {
            System.out.println("You entered tails and it was tails.");
        } else if (answer == 1 && number == 0) {
            System.out.println("You entered heads and it was tails.");
        }

    }
}
