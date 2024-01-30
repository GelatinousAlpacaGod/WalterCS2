import java.util.Scanner;

public class FactorialCalculator
{
    public static void main(String[] args)
    {
        // call the function to get user input and find factorial
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        long factorialResult = calculateFactorial(number);
        // print the result
        System.out.println("The factorial of " + number + " is: " + factorialResult);
    }
    // fu0ction to find the factorial of a number
    static long calculateFactorial(int num)
    {
        if (num < 0)
        {
            // factorial just ain't defined for negative numbers
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++)
        {
            factorial *= i;
        }
        return factorial;
    }
}
