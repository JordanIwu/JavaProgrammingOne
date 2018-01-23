package Chapter5;

import java.util.Scanner;

/**
 * Reverses strings entered in by the user
 *
 * @author Jordan Iwuchukwu
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        System.out.println("The reversed version is " + (new StringBuffer(s1).reverse().toString()));
    }
}
