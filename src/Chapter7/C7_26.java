package Chapter7;

import java.util.Scanner;

/**
 * Asks the user to enter in arrays then checks if they are identical
 *
 * @author Jordan Iwuchukwu
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1:");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
            System.out.print("Enter list2:");
            int[] list2 = new int[input.nextInt()];
            {
                list2[i] = input.nextInt();
            }
        }
    }
}
