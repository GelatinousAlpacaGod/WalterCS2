import java.util.Scanner;

class multiplicationtables
{
    public static void main(String[] args) {
        // create scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        // prompt user to enter an integer
        System.out.print("Enter an integer: "); 
        // read the integer input from the user
        int number = scanner.nextInt(); 
        // close the scanner to prevent resource leak
        scanner.close(); 
        // print the multiplication table
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
