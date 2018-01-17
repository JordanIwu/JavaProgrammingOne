
package Chapter2;

/**
 * Finds are and length of a cylinder by using the radius and length entered in by
 * the user
 * @author Jordan Iwuchukwu
 */
    import java.util.Scanner;

public class C2_2 {
    public static void main(String[] args) {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

            Scanner input = new Scanner(System.in);            
            System.out.print("Enter the radius and Length ");
            double Radius = input.nextDouble();
            double Length = input.nextDouble();
            double Area= Radius * Radius * Math.PI;
            System.out.println("The Area is " + Area);
            System.out.println("The Volume is " + Area * Length);
    }
}
