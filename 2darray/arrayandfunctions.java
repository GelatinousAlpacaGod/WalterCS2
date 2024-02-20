public class arrayandfunctions
{
    public static void main(String[] args)
    {
        int[][] matrix =
        {
            {1, -2, 3},
            {-4, 5, -6},
            {7, -8, 9}
        };
        System.out.println("original:");
        printMatrix(matrix);
        modifyMatrixAbsolute(matrix);   
        System.out.println("\nabsolute values:");
        printMatrix(matrix);
    }
    public static void modifyMatrixAbsolute(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = Math.abs(matrix[i][j]);
            }
        }
    }
    public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}