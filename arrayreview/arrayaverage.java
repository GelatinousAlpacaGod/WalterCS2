import java.util.Scanner;

public class arayaverage
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // snatch the size
        System.out.print("enter array size: ");
        int size = scanner.nextInt();
        // initialize
        int[] array = new int[size];
        // get elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        // calculate and display
        double average = calculateAverage(array);
        System.out.println("The average of the elements is: " + average);

        scanner.close();
    }

    // function to calculate
    static double calculateAverage(int[] arr)
    {
        int sum = 0;
        for (int num : arr)
        {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}