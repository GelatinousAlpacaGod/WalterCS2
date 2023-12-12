public class maximumelement
{
    public static void main(String[] args)
    {
        int[] array = {5, 2, 8, 1, 6};
        int max = findMaxElement(array);
        System.out.println("Maximum element in the array: " + max);
    }
    // function to find the maximum element
    public static int findMaxElement(int[] arr)
    {
        if (arr.length == 0)
        {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = arr[0]; // assume the first element is it
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }
}
