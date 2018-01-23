package Chapter5;

import java.util.Scanner;

/**
 * Has a user play rock paper scissors with the program
 *
 * @author Jordan Iwuchukwu
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Wins = 0;
        int ComputerWins = 0;
        int Ties = 0;
        while (Wins < 2 && ComputerWins < 2) {
            System.out.println("Pick Scissors with 0, rock with 1, or paper with 2");

            double PlayerGuess = input.nextDouble();
            int ComputerGuess = (int) (Math.random() * 3);
//Rock functions
            if (ComputerGuess == 0 && PlayerGuess == 1) {
                System.out.println("You guessed rock and the computer guessed scissors: You Won");
                Wins++;
            }
            if (ComputerGuess == 1 && PlayerGuess == 1) {
                System.out.println("You guessed rock and the computer guessed rock: You Tied");
                Ties++;
            }
            if (ComputerGuess == 2 && PlayerGuess == 1) {
                System.out.println("You guessed rock and the computer guessed paper: You Lost");
                ComputerWins++;
            }
            // Scissors functions
            if (ComputerGuess == 0 && PlayerGuess == 0) {
                System.out.println("You guessed scissors and the computer guessed scissors: You Tied");
                Ties++;

            }
            if (ComputerGuess == 1 && PlayerGuess == 0) {
                System.out.println("You guessed scissors and the computer guessed rock: You Lost");
                ComputerWins++;
            }
            if (ComputerGuess == 2 && PlayerGuess == 0) {
                System.out.println("You guessed scissors and the computer guessed paper: You Won");
                Wins++;
            }
            //Paper functions
            if (ComputerGuess == 0 && PlayerGuess == 2) {
                System.out.println("You guessed paper and the computer guessed scissors: You Lost");
                ComputerWins++;
            }
            if (ComputerGuess == 1 && PlayerGuess == 2) {
                System.out.println("You guessed paper and the computer guessed rock: You Won");
                Wins++;
            }

            if (ComputerGuess == 2 && PlayerGuess == 2) {
                System.out.println("You guessed paper and the computer guessed paper: You Tied");
                Ties++;
            }
        }
        if (ComputerWins == 2) {
            System.out.println("The computer won.");
        }
        if (Wins == 2) {
            System.out.println("You won.");
        }
    }

}
