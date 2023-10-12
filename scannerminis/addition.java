import java.util.Scanner;

class addition
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("gimme a number: ");
        double num1 = reader.nextDouble();
        System.out.print("ANOTHA WOn!!!!!!: ");
        double num2 = reader.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}