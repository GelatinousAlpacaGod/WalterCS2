import java.util.Scanner;

public class stageoflife 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) 
        {
            System.out.println("Age cannot be negative.");
        } else 
        {
            if (age <= 12) 
            {
                System.out.println("You are a child.");
            } 
            else if (age >= 13 && age <= 19) 
            {
                System.out.println("You are a teenager.");
            }
             else if (age >= 20 && age <= 64) 
             {
                System.out.println("You are an adult.");
            }
             else if (age >= 65 && age <= 120) 
             {
                System.out.println("You are a senior citizen.");
            } 
             else 
             {
                System.out.println("You are either very old or not alive.");
            }
        }
    }
}