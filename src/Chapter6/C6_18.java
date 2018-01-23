package Chapter6;

import java.util.Scanner;

/**
 * Asks the user to create a password that follows a series of rules.
 *
 * @author Jordan Iwuchukwu
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String s = input.nextLine();

        if (isValid(s) == true) {
            System.out.println("The Password is valid.");
        } else {
            System.out.println("The Password is invalid.");
        }

    }

    /**
     *
     * @param password The password entered in by the user is checked for
     * whether or not it is long enough, has enough numerical digits in it, and
     * only contains numbers and letters
     * @return returns true or false based off of these things and will end the
     * program
     */
    public static boolean isValid(String password) {

        //must have 8 characters
        if (password.length() < 8) {
            System.out.println("The Password is invalid. It is too short");
            return false;
        }
        //must have only digits and letters
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        //must contain atleast 2 digits
        int numberOfDigit = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++numberOfDigit;
            }
        }
        if (numberOfDigit < 2) {
            System.out.println("The password is invalid. The password does not contain enough numbers");
            return false;
        }

        //if all conditions are met
        return true;
    }
}
