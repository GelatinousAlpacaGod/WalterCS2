import java.util.Scanner;
import java.time.LocalDate;

class birth
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age + " years");
    }
}