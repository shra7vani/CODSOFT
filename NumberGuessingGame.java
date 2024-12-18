import java.util.Scanner;

public class NumberGuessingGame {

    // Method to play a single round of the guessing game
    public static boolean playRound(int maxAttempts, Scanner scanner) {
        // Generate a random number between 1 and 100 using Math.random()
        int secretNumber = (int)(Math.random() * 100) + 1;
        int attempts = 0;

        System.out.println("\nI have picked a number between 1 and 100. Try to guess it!");

        while (attempts < maxAttempts) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Your guess: ");
            int guess;
            try {
                guess = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
                continue;
            }

            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! The number was " + secretNumber + ".");
                return true;  // User guessed correctly
            }
        }

        System.out.println("\nSorry! You've used all " + maxAttempts + " attempts. The number was " + secretNumber + ".");
        return false;  // User did not guess correctly
    }

    // Main function to manage the game and multiple rounds
    public static void playGame() {
        int roundsPlayed = 0;
        int roundsWon = 0;
        int maxAttempts = 10;

        Scanner scanner = new Scanner(System.in);  // Create Scanner at the start

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            roundsPlayed++;
            System.out.println("\n--- Round " + roundsPlayed + " ---");

            if (playRound(maxAttempts, scanner)) {
                roundsWon++;
            }

            // Ask if the user wants to play another round
            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Display the final score
        System.out.println("\nGame Over! You played " + roundsPlayed + " rounds and won " + roundsWon + " round(s).");
        System.out.println("Thanks for playing!");

        // Close the scanner after game is over
        scanner.close();
    }

    // Entry point of the game
    public static void main(String[] args) {
        playGame();
    }
}
