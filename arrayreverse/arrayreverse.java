import java.util.Scanner;

public class arrayreverse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size <= 0)
        {
            System.out.println("Invalid array size. Please enter a positive integer.");
            return;
        }
        int[] array = new int[size];
        //input the values
        System.out.println("Enter values for the array:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter value at index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        //reverse em
        for (int i = 0; i < size / 2; i++)
        {
            //SWAP
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        //print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++)
        {
            System.out.println("Index " + i + ": " + array[i]);
        }
        scanner.close();
    }
}
