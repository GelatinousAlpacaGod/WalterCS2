import java.util.Scanner;
import java.util.Random;

public class guessinggame 
{
    public static void main(String[] args) 
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
        int userGuess;
        System.out.println("welcome to the number guessing game");
        System.out.println("guess a number between 1 and 100:");
        do 
        {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            if (userGuess > randomNumber) 
            {
                System.out.println("too high, try again.");
            }
            else if (userGuess < randomNumber) 
            {
                System.out.println("too low, try again.");
            }
            else 
            {
                System.out.println("you guessed the number " + randomNumber + " correctly!");
            }
        } while (userGuess != randomNumber);
    }
}
