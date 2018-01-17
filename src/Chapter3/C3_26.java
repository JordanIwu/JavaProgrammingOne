package Chapter3;

/**
 *Finds out whether or not a number is divisible by 5 or 6
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;
public class C3_26 {
     public static void main(String[] args) {
         /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

         Scanner input = new Scanner(System.in);            
         System.out.println("Enter a number to see if it is divisible by 5 or 6");
         double Number = input.nextDouble();
             System.out.println("Is " + Number + " divisible by 5 and 6 :" + (Number % 5 == 0 && Number % 6 == 0));
              System.out.println("Is " + Number + " divisible by 5 or 6 :" + (Number % 5 == 0 || Number % 6 == 0));
              System.out.println("Is " + Number + " divisible by 5 or 6 but not both :" + (Number % 5 == 0 ^ Number % 6 == 0));
    }
}
