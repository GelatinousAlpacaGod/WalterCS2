import java.util.Scanner;

public class letterfinder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("gimme a string: ");
        String inputString = scanner.nextLine();
        System.out.print("what are ya lookin 4?: ");
        char letterToFind = scanner.next().charAt(0);
        int count = 0;
        boolean found = false;
        for (int i = 0; i < inputString.length(); i++) 
        {
            if (inputString.charAt(i) == letterToFind) 
            {
                count++;
                found = true;
            }
        }
        if (found) 
        {
            System.out.println("The letter '" + letterToFind + "' is found " + count + " time(s) in the string.");
        } else 
        {
            System.out.println("The letter '" + letterToFind + "' is not found in the string.");
        }
    }