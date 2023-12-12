public class chessboard
{
    public static void main(String[] args) {
        int size = 8; // this is the size you are able to change it
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                if ((i + j) % 2 == 0) {
                    System.out.print("\u25A1 "); // white squares
                } 
                else 
                {
                    System.out.print("\u25A0 "); // black squares
                }
            }
            System.out.println(); // move to the next row
        }
    }
}
