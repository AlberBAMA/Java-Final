import java.util.Random;

public class DiceGameLoopFinal {
    public static void main(String[] args) {

        int computerWins = 0;
        int userWins = 0;

        Random random = new Random();
        System.out.println("------ The GAME START --------");

        // For loop that repeats 10 times
        for (int i = 1; i <= 10; i++) {
            // Generate numbers between 1 and 6
            int computerDie = random.nextInt(6) + 1;
            int userDie = random.nextInt(6) + 1;

            System.out.print("Round " + i + ": Comp = " + computerDie + " and User = " + userDie);

            // Determine the round winer
            if (computerDie > userDie) {
                computerWins++;
                System.out.println(" == The computer wins");
            } else if (userDie > computerDie) {
                userWins++;
                System.out.println(" == The user wins");
            } else {
                System.out.println(" == It is a draw");
            }
        }

        // Final results
        System.out.println("\n---------------------------------------------");
        System.out.println("Computer wins: " + computerWins);
        System.out.println("User wins: " + userWins);

        // Determine the final winner
        if (computerWins > userWins) {
            System.out.println("The computer is the final winner!");
        } else if (userWins > computerWins) {
            System.out.println("The user is the final winner!");
        } else {
            System.out.println("It is a draw");
        }

    }}
