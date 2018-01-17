package Chapter4;

/**
 *Checks to see if a string entered in by the user is 
 * contained in a previous string entered in by the user
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;
public class C4_22 {
public static void main(String[] args) {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

 Scanner input = new Scanner(System.in);
 System.out.print("Enter string s1:");
 String s1 = input.nextLine();
 System.out.print("Enter string s2:");
 String s2 = input.nextLine();
 if (s1.contains(s2)) {
  System.out.println(s2 + " is a substring of " + s1);
 } else {
  System.out.println(s2 + " is not a substring of " + s1);
 }
}
}


