import java.util.Random;
import java.util.Scanner;
public class rockpaper 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = { "Rock", "Paper", "Scissors" };
        System.out.println("yo, it's game time");
        System.out.print("enter your choice (Rock, Paper, or Scissors): ");
        String userChoice = scanner.next();
        if 
        (!(userChoice.equalsIgnoreCase("Rock") || userChoice.equalsIgnoreCase("Paper") || userChoice.equalsIgnoreCase("Scissors"))) {
            System.out.println("you dumb? i said enter Rock, Paper, or Scissors.");
            scanner.close();
            return;
        }

        int computerChoiceIndex = random.nextInt(3);
        String computerChoice = options[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);
        System.out.println("You chose: " + userChoice);

        if 
        (userChoice.equalsIgnoreCase(computerChoice)) 
        {
            System.out.println("It's a tie!");
        } 
        else if 
        ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors"))
            || (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
            || (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) 
            {
            System.out.println("cool. you won. congrats i guess...");
        } 
        else 
        {
            System.out.println("YES!!! I WON OH YEAHHH!!!1 YOU SUCK!!!!");
        }
    }
}
