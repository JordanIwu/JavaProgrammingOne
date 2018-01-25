package Chapter7;

import java.util.Scanner;

/**
 * Finds out the average of an array then prints out all numbers within the
 * array
 *
 * @author Jordan Iwuchukwu
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.print("How many numbers are there");
        Scanner input = new Scanner(System.in);
        int[] Array = new int[input.nextInt()];
        int sum = 0;

        fillArray(Array, input);
        System.out.println("The average is " + Average(Array));
        displayArray(Array);
    }

    /**
     * fills up the Array with numbers the amount of which is predetermined by
     * the user
     *
     * @param Array The array is filled with an amount of numbers equal to the
     * amount of numbers the user asked to be put into it
     * @param input input is the users most recent input and it will be used to
     * fill the array
     *
     */
    public static void fillArray(int[] Array, Scanner input) {
        System.out.print("Enter " + Array.length + " numbers.");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = input.nextInt();
        }
    }

    /**
     * Finds the average of the arrays numbers
     *
     * @param Array all of the numbers in the array are added to each other then
     * divided by the length of the array in ordered to get an average for the
     * array.
     * @return Returns the aver as a number for it to be printed out
     */
    public static double Average(int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return (sum / Array.length);
    }

    /**
     * Prints out the arrays average
     *
     * @param Array contained the information about the array that needs to be
     * printed out.
     */
    public static void displayArray(int[] Array) {
        System.out.print("Array: " + java.util.Arrays.toString(Array));
    }

}
