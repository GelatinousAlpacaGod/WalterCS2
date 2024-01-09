import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 10
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Adding 1 to make sure the number is between 1 and 10

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Guess the Number Game!");

        boolean guessedCorrectly = false;

        // Start the game loop
        while (!guessedCorrectly) {
            // prompt the user to guess the number
            System.out.print("guess the number between 1 and 10: ");
            // read the user's guess
            int userGuess = scanner.nextInt();
            // provide feedback based on the user's guess
            if (userGuess < randomNumber) {
                System.out.println("Too low, dork");
            }
            else 
            if (userGuess > randomNumber)
            {
                System.out.println("too high, geek");
            } 
            else
            {
                System.out.println("congrats You guessed the correct number, just don't make a big deal out of it.");
                guessedCorrectly = true;
            }
        }
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
