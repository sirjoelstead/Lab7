package edu.cscc;
import java.util.*;

/**
 * The Rock, Paper, Scissors, Lizard, Spock program is a game where the user
 * chooses either Rock, Paper, Scissors, Lizard or Spock and the computer
 * randomly generates a pick to see who wins.
 *
 * @author Joel Stead
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

     /**
     * This is the main method which implements and makes calls to the RPSLSpock class.
     * @param args unused.
     */

    public static void main(String[] args) {
        /*
         * h_pick is human choice input.
         * c_pick is computer generated choice.
         * answer is for whether or not to play again.
         * isValid is variable that is assigned the isValidPick method to check to see whether the user input a valid entry.
         */
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;

        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}