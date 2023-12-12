public class evenorodd
{
    public static void countAndPrintEvenOdd(int[] array, String type)
    {
        if (array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Array elements and their type:");
        for (int num : array)
        {
            System.out.println(num + " is " + (num % 2 == 0 ? "even" : "odd"));
            if (num % 2 == 0)
            {
                evenCount++;
            } else
            {
                oddCount++;
            }
        }
        System.out.println("\nCount of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
        if ("even".equalsIgnoreCase(type))
        {
            System.out.println("Printing even numbers:");
            printNumbersByType(array, true);
        } else if ("odd".equalsIgnoreCase(type))
        {
            System.out.println("Printing odd numbers:");
            printNumbersByType(array, false);
        } else
        {
            throw new IllegalArgumentException("Invalid type. Use 'even' or 'odd'.");
        }
    }

    private static void printNumbersByType(int[] array, boolean isEven)
    {
        for (int num : array)
        {
            if ((num % 2 == 0 && isEven) || (num % 2 != 0 && !isEven))
            {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // example usage
        int[] array = {5, 3, 9, 1, 7, 4, 6, 8, 2};
        // count and print even numbers
        countAndPrintEvenOdd(array, "even");
        // count and print odd numbers
        countAndPrintEvenOdd(array, "odd");
    }
}
