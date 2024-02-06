public class passarray
{
    public static void main(String[] args)
    {
        // define an array
        int[] numbers = {5, 10, 15, 20, 25};
        // print the array
        System.out.print("Array: ");
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        // call the method to calculate the average
        double average = calculateAverage(numbers);
        // print the average
        System.out.println("Average: " + average);
    }
    public static double calculateAverage(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return 0.0; // Return 0 if the array is empty or null
        }
        // find the sum of all elements in the array
        int sum = 0;
        for (int num : array)
        {
            sum += num;
        }
        // find average
        double average = (double) sum / array.length;
        return average;
    }
}
