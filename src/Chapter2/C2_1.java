package Chapter2;

/**
 *Asks the user to enter a degree in Celsius then prints out the degree in Fahrenheit
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;

public class C2_1 {
    public static void main(String[] args) {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

            Scanner input = new Scanner(System.in);
            double fahrenheit;
            System.out.print("Enter a degree in Celsius ");
            double Celsius = input.nextDouble();
            fahrenheit = (9 / 5.0) * Celsius + 32;
            System.out.println(Celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
    

