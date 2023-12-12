public class arrayaverage
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        double average = calculateAverage(array);
        System.out.println("Average of the elements in the array: " + average);
    }
    // function to calculate the average
    public static double calculateAverage(int[] arr)
    {
        if (arr.length == 0)
        {
            return 0; // avoiding dividing by 0
        }
        int sum = 0;
        for (int element : arr)
        {
            sum += element;
        }
        return (double) sum / arr.length;
    }
}
