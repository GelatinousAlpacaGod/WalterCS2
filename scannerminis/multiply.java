 import java.util.Scanner;

class multiply
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HANDS UP!! GIVE ME YOUR NUMBeR OR I'LL SHOOt!!");
        double number = scanner.nextDouble();
        double doubledNumber = number * 2;
        System.out.println("The doubled number is: " + doubledNumber);
    }
}