package Chapter4;

import java.util.Scanner;

/**
 * Picks a worker to work for you based off of how quickly they get work done
 * and how much they get paid to work
 *
 * @author Jordan Iwuchukwu
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the 1st bidders name ");
        String FirstName = input.next();
        System.out.println("How many hours of work does the 1st bidder need ");
        int FirstHour = input.nextInt();
        System.out.println("How much does the 1st bidder charge ");
        double FirstCharge = input.nextDouble();
        System.out.println("What is the 2nd bidders name ");
        String SecondName = input.next();
        System.out.println("How many hours of work does the 2nd bidder need ");
        int SecondHour = input.nextInt();
        System.out.println("How much does the 2nd bidder charge ");
        double SecondCharge = input.nextDouble();
        double FirstCost = FirstCharge * FirstHour;
        double SecondCost = SecondCharge * SecondHour;
        if (FirstCost < SecondCost) {
            System.out.printf("\n The winner is " + FirstName + "\n The total cost is " + "$%.2f\n", FirstCost);
        }
        if (SecondCost < FirstCost) {
            System.out.printf("\n The winner is " + SecondName + "\n The total cost is " + "$%.2f\n", SecondCost);
        }
        if (SecondCost == FirstCost && FirstHour < SecondHour) {
            System.out.printf("\n The winner is " + FirstName + "\n The total cost is " + "$%.2f\n", FirstCost);
        }
        if (SecondCost == FirstCost && SecondHour < FirstHour) {
            System.out.printf("\n The winner is " + SecondName + "\n The total cost is " + "$%.2f\n", SecondCost);
        }
        if (SecondCost == FirstCost && SecondHour == FirstHour) {
            System.out.printf("\nBidders %s and %s have identical bids", FirstName, SecondName);
            System.out.printf("\nThe cost per hour was $%.2f\n", FirstCost);
            System.out.println("The hours were " + FirstHour);

        }
    }

}
