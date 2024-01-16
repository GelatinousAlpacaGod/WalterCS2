import java.util.Random;
import java.util.Scanner;

public class PerfectSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the 2D array
        System.out.print("put the number of rows in the bag! ");
        int rows = scanner.nextInt();
        System.out.print("now the number of columns, or i'll step on this frog");
        int cols = scanner.nextInt();

        // Create and fill the 2D array with random values between 1 and 1000
        int[][] array = new int[rows][cols];
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(1000) + 1;
            }
        }

        // make a new 2d array to store whether each value is a perfect square
        String[][] resultArray = new String[rows][cols];

        // check if each value is a perfect square and update the result array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int value = array[i][j];
                double sqrt = Math.sqrt(value);
                resultArray[i][j] = (sqrt == Math.floor(sqrt)) ? "Yea" : "Nay";
            }
        }

        // print the original array
        System.out.println("OG 2d Array:");
        printArray(array);

        // print the second array
        System.out.println("Perfect Square Check:");
        printArray(resultArray);
    }

    // helper method to print a 2d array
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }/

    // helper method to print a 2d array of strings
    private static void printArray(String[][] array) {
        for (String[] row : array) {
            for (String value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
