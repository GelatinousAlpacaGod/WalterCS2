import java.util.Scanner;

public class testfunction1
{
    public static void main(String[] args)
    {
        // call the function to get user input and multiply
        double result = multiplyNumbers();
        // print the result
        System.out.println("The result of the multiplication is: " + result);
    } 
    // function to take user input and multiply
    static double multiplyNumbers() {
        Scanner scanner = new Scanner(System.in);
        // swipe the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        // snatch the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        // perform the multiplication and return the result
        return num1 * num2;
    }
}
