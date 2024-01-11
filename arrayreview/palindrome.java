import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("put in a word: ");
        String word = scanner.nextLine().toLowerCase(); // make it lowercase to avoid case sensitivity
        if (isPalindrome(word))
        {
            System.out.println("it's a palidrome.");
        } 
        else
        {
            System.out.println("L + Ratio + not a palindrome.");
        }
        scanner.close();
    }
    // function to check if the word is a palindrome
    static boolean isPalindrome(String word)
    {
        char[] charArray = word.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length / 2; i++)
        {
            if (charArray[i] != charArray[length - 1 - i])
            {
                return false;
            }
        }
        return true;
    }
}