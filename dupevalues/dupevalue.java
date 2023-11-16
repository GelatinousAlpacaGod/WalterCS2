import java.util.Scanner;
public class dupevalue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        final int maxvalue = 25;
        int[] values = new int[maxvalue];
        int[] occurrences = new int[maxvalue];
        int count = 0;
        boolean foundDuplicate = false;
        System.out.println("enter up to 25 values (enter a non-number to stop):");
        for (int i = 0; i < maxvalue && scanner.hasNextInt(); i++)
        {
            System.out.print("Enter value #" + (i + 1) + ": ");
            int currentValue = scanner.nextInt();
            for (int j = 0; j < count; j++)
            {
                if (values[j] == currentValue)
                {
                    foundDuplicate = true;
                    occurrences[j]++;
                }
            }
            if (!foundDuplicate)
            {
                values[count] = currentValue;
                occurrences[count]++;
                count++;
            }
            foundDuplicate = false;
        }
        if (count > 0)
        {
            System.out.println("Duplicates found:");
            for (int i = 0; i < count; i++)
            {
                if (occurrences[i] > 1)
                {
                    System.out.println(values[i] + " was duplicated " + occurrences[i] + " times.");
                }
            }
        } else
        {
            System.out.println("No duplicates found.");
        }
    }
}
