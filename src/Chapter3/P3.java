
package Chapter3;

/**
 * The program compares 2 numbers entered in by the user tries to use them as a fraction
 * and then puts them on a grading scale from A to F
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

        Scanner input = new Scanner(System.in);
    System.out.println("Enter in a number");
    double number1 = input.nextDouble();
    System.out.println("Enter in a 2nd number");
    double number2 = input.nextDouble();
    if (number1 > number2)
        System.out.println("The 2nd number is less then the 1st number");
    if (number2 > number1)
         System.out.println("The 1st number is less then the 2nd number");
    if (number1==number2)
        System.out.println("The 1st number is equal to the second");
    if (number1 > number2 || number1 < number2)
        System.out.println("The 1st  number is not equal to the second.");
    if (number2 == 0)
        System.out.println("Cannot divide by zero");
    double Question10 = number1 / number2;
    if (Question10 < 0)
        System.out.println("Proper fraction");
    if (Question10 > 0)
        System.out.println("improper fraction");
    if (number1 >= 90)
        System.out.println("A");
    if (number1 >= 80 && number1<90)
        System.out.println("B");
    if (number1 >= 70 && number1<80)
        System.out.println("C");
    if (number1 >= 60 && number1<70)
        System.out.println("D");
    if (number1 < 60 )
        System.out.println("F");
    if (number2 >= 1 && number2 <= 100)
        System.out.println("In range");
    if (number2 < 1 ^ number2 > 100)
        System.out.println("Out of range");
        
        }
}