import java.util.Scanner;

public class vowelcheck 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single letter: ");
        String input = scanner.next();
        if (input.length() != 1) 
        {
            System.out.println("Please enter only a single letter.");
        }
         else 
         {
            char letter = input.charAt(0);
            letter = Character.toLowerCase(letter);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') 
            {
                System.out.println(letter + " is a vowel.");
            }
             else 
             {
                System.out.println(letter + " is a consonant.");
            }
        }
    }
}

