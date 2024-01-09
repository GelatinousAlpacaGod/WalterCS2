import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive integer
        System.out.print("enter a positive number: ");

        // read the positive integer input from the user
        int number = scanner.nextInt();
        // close the scanner to prevent resource leak
        scanner.close();
        // calculate the sum of digits
        int sum = calculateSumOfDigits(number);
        // print the result
        System.out.println("the sum of  the digits in " + number + " is " + sum);
    }
    // function to calculate the sum of digits in a number
    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        // iterate through each digit and add
        while (num != 0) {
            sum += num % 10; // add the last digit to the sum
            num /= 10;       // remove the last digit
        }
        return sum;
    }
}
