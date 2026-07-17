import java.util.Random;
import java.util.Scanner;

public class RPSLS {

    enum Move {
        ROCK, PAPER, SCISSORS, LIZARD, SPOCK
    }

    static int winner(Move a, Move b) {

        if (a == b)
            return 0;

        switch (a) {

            case SCISSORS:
                if (b == Move.PAPER || b == Move.LIZARD)
                    return 1;
                break;

            case PAPER:
                if (b == Move.ROCK || b == Move.SPOCK)
                    return 1;
                break;

            case ROCK:
                if (b == Move.LIZARD || b == Move.SCISSORS)
                    return 1;
                break;

            case LIZARD:
                if (b == Move.SPOCK || b == Move.PAPER)
                    return 1;
                break;

            case SPOCK:
                if (b == Move.SCISSORS || b == Move.ROCK)
                    return 1;
                break;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int playerScore = 0;
        int computerScore = 0;

        Move[] moves = Move.values();

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nRound " + i);
            System.out.print("Enter Move (ROCK/PAPER/SCISSORS/LIZARD/SPOCK): ");

            Move player = Move.valueOf(sc.next().toUpperCase());

            Move computer = moves[r.nextInt(5)];

            System.out.println("Computer = " + computer);

            int result = winner(player, computer);

            if (result == 1) {
                System.out.println("You Win!");
                playerScore++;
            } else if (result == -1) {
                System.out.println("Computer Wins!");
                computerScore++;
            } else {
                System.out.println("Tie!");
            }
        }

        System.out.println("\nFinal Score");
        System.out.println("You = " + playerScore);
        System.out.println("Computer = " + computerScore);

        if (playerScore > computerScore)
            System.out.println("Overall Winner: You");
        else if (computerScore > playerScore)
            System.out.println("Overall Winner: Computer");
        else
            System.out.println("Overall Result: Tie");

        sc.close();
    }
}