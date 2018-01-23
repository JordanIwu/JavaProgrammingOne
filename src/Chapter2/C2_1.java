package Chapter2;

import java.util.Scanner;

/**
 * Asks the user to enter a degree in Celsius then prints out the degree in
 * Fahrenheit
 *
 * @author Jordan Iwuchukwu
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahrenheit;
        System.out.print("Enter a degree in Celsius ");
        double Celsius = input.nextDouble();
        fahrenheit = (9 / 5.0) * Celsius + 32;
        System.out.println(Celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
