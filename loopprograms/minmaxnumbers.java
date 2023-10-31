import java.util.Scanner;

public class minmaxnumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (enter any non-number to stop):");
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }
        if (smallest == Integer.MAX_VALUE || largest == Integer.MIN_VALUE) 
        {
            System.out.println("No valid numbers entered.");
        } else 
        {
            System.out.println("Smallest number: " + smallest);
            System.out.println("Largest number: " + largest);
        }
    }
}
