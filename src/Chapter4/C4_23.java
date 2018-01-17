
package Chapter4;

/**
 * Checks the pay of a worker while considering taxes on both the state and federal level
 * @author Jordan Iwuchukwu
 */
import java.util.Scanner;
public class C4_23 {
    public static void main(String[] args) {
        /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    Scanner input = new Scanner(System.in);
    System.out.println("Enter employee's name");
    String Name = input.next();
    System.out.println("Enter number of hours worked in a week");
   int Hours = input.nextInt();
    System.out.println("Enter hourly pay rate");
    double PayRate = input.nextDouble();
    System.out.println("Enter federal tax withholding rate");
    double FTax = input.nextDouble();
    System.out.println("Enter state tax withholding rate");
    double STax = input.nextDouble();
    System.out.printf("\nEmployee Name: %s", Name);
    System.out.printf("\nHours Worked: %d", Hours);
    System.out.printf("\nPay Rate: $%.2f\n", PayRate);
    double GrossPay = PayRate * Hours;
    System.out.printf("Gross Pay: $%.2f\n", GrossPay); 
    System.out.println("Deductions:");
    double FWithholding = FTax * GrossPay;
     System.out.printf("Federal Witholding (%.2f%%): $%.2f\n", (FTax * 100), FWithholding);
    double SWithholding = STax * GrossPay;
     System.out.printf("State Witholding (%.2f%%): $%.2f\n", (STax * 100), SWithholding);
    double Deduction = SWithholding + FWithholding;
    System.out.printf("Total Deduction: $%.2f\n", Deduction);
    double NetPay = GrossPay - Deduction;
    System.out.printf("Net Pay: $%.2f\n", NetPay);    
}
}

