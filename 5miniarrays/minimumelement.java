public class minimumelement 
{
    public static int findMinElement(int[] array)
    {
        // check if the array is not empty
        if (array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array is empty or null");
        }
        // initialize the minimum element as the first element
        int minElement = array[0];
        // iterate through the array to find minimum element
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < minElement)
            {
                minElement = array[i];
            }
        }
        return minElement;
    }
    public static void main(String[] args)
    {
        // example usage
        int[] array = {5, 3, 9, 1, 7};
        int minElement = findMinElement(array);
        System.out.println("Minimum element in the array: " + minElement);
    }
}
