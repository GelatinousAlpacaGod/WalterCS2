public class arraysum
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        int sum = calculateSum(array);
        System.out.println("Sum of the elements in the array: " + sum);
    }
    // function to calculate sum
    public static int calculateSum(int[] arr)// arr is a parameter
    {
        int sum = 0;
        for (int element : arr)
        {
            sum += element;
        }
        return sum;
    }
}
