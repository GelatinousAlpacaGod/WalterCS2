import java.util.Scanner;
public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a word: ");
        String word = scanner.nextLine();
        for (int i = word.length(); i > 0; i--) {
            System.out.println(word.substring(0, i));
        }
    }
}
