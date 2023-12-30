import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Guess the Number game 🎮");

        while (true) {
            // Step 1: Generate a random number within the specified range
            int secretNumber = random.nextInt(100) + 1;

            // Initialize variables for attempts and rounds
            int attempts = 0;
            int roundsWon = 0;

            // Step 6: Add the option for multiple rounds
            while (true) {
                // Step 5: Limit the number of attempts
                if (attempts == 0) {
                    System.out.println("\nRound " + (roundsWon + 1) + ": Try to guess the number between 1 and 100. 🎯");
                } else {
                    System.out.println("\nAttempts left: " + (10 - attempts + 1));
                }

                // Step 2: Prompt the user to enter their guess
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                // Step 3: Compare the user's guess and provide feedback
                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + "! 🥳🥳🥳");
                    roundsWon++;
                    break;
                } else if (userGuess < secretNumber) {
                    System.out.println("Too low! Try again 👇");
                } else {
                    System.out.println("Too high! Try again 👆");
                }

                // Increment the attempts
                attempts++;

                // Step 5: Limit the number of attempts
                if (attempts == 10) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + secretNumber + ".");
                    break;
                }
            }

            // Step 7: Display the user's score
            System.out.println("Round " + roundsWon + ": You took " + attempts + " attempts to guess the correct number.");

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                System.out.println("Thanks for playing! Goodbye 👋");
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
