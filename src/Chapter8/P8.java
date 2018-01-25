package Chapter8;

import java.util.Scanner;

/**
 * Records data on salesman based off of how much money they've sold things for
 * what day the sale was made and the ID used to tell people what salesman made
 * the sale
 *
 * @author Jordan Iwuchukwu
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int loopender = 0;
        String UserInput = " ", salesManID = " ", dayID = " ";
        double SaleAmount = 0;
        double[][] data = new double[4][5];
        //worker selection

        while (loopender != 1) {//  posible infinite loop.
            //loop ender
            System.out.print("Enter the salesman ID as A, B, C, or D.");
            salesManID = input.next();
            if (getValID(salesManID) != -1) {
                System.out.print("Enter the day as M, T, W, H, or F. ");
                dayID = input.next();
                if (getValID(dayID) != -1) {
                    System.out.print("Enter the amount of the sale ");
                    SaleAmount = input.nextDouble();
                    data[getValID(salesManID)][getValID(dayID)] += SaleAmount;
                }

            }
            System.out.print("Do you have more conversions? :");

            do {
                UserInput = input.next();
                if (!(UserInput.equalsIgnoreCase("n") ^ UserInput.equalsIgnoreCase("Y"))) {
                    System.out.print("Enter Y for more data or N to stop and print data: ");
                    continue;
                } else {
                    break;
                }
            } while (UserInput.equalsIgnoreCase("n") || UserInput.equalsIgnoreCase("Y"));

            if (UserInput.equalsIgnoreCase("n")) {
                break;
            } else if (UserInput.equalsIgnoreCase("n")) {
                continue;
            }
        }
        System.out.println("\t     M    T\tW\tH\tF");
        for (int x = 0; x < data.length; x++) {
            System.out.print("Employee " + x + " ");
            for (double val : data[x]) {
                System.out.printf(" %.2f", val);
            }
            System.out.println();
        }

    }

    /* 
           A -> 0
           B -> 1
           C -> 2
           D -> 3
           -----------------
           M -> 0
           T -> 1
           W -> 2
           H -> 3
           F -> 4
     */
    // method to return ID values
    /**
     *
     * @param ID gets information entered in by the user and stores it
     * @return returns the ID of the salesman based off the information entered
     * by the user
     */
    public static int getValID(String ID) {
        if (ID.equalsIgnoreCase("a")) {
            return 0;
        } else if (ID.equalsIgnoreCase("b")) {
            return 1;
        } else if (ID.equalsIgnoreCase("c")) {
            return 2;
        } else if (ID.equalsIgnoreCase("d")) {
            return 3;
        } else if (ID.equalsIgnoreCase("m")) {
            return 0;
        } else if (ID.equalsIgnoreCase("t")) {
            return 1;
        } else if (ID.equalsIgnoreCase("w")) {
            return 2;
        } else if (ID.equalsIgnoreCase("h")) {
            return 3;
        } else if (ID.equalsIgnoreCase("f")) {
            return 4;
        } else {
            return -1; // error value
        }

    }
}
