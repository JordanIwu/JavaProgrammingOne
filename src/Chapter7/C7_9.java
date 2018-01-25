package Chapter7;

import java.util.Scanner;

/**
 * Asks the user to enter in a series of numbers then find out which of these
 * numbers is the smallest
 *
 * @author Jordan Iwuchukwu
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter in 10 numbers");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
            System.out.println("The minimum number is: " + min(numbers));
        }
    }

    /**
     *
     * @param array moves through all of the numbers in the array then lowest of
     * which will be set as the variable min and returned to the main method
     * @return Returns the true lowest number in the set
     */
    public static double min(double[] array) {

        double min = array[0];
        // min equals the equals any number that is less then the ones before it

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;

    }
}
