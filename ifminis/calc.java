import java.util.Scanner;

public class calc
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;
        System.out.print("enter first number: ");
        num1 = scanner.nextDouble();
        System.out.print("enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("enter second number: ");
        num2 = scanner.nextDouble();
        double result = 0;
        if (operator == '+')
        {
            result = num1 + num2;
        }
        if (operator == '-')
        {
            result = num1 - num2;
        }
        if (operator == '*')
        {
            result = num1 * num2;
        }
        if (operator == '/')
        {
            if (num2 != 0)
            {
                result = num1 / num2;
            } else
            {
                System.out.println("Error: Division by zero is not allowed.");
                return;
            }
        }
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/')
        {
            System.out.println("Invalid operator entered.");
            return;
        }
        System.out.println("Result: " + result);
    }
}
