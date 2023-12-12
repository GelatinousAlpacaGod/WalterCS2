public class FullChessboard
{
    public static void main(String[] args)
    {
        char[][] chessboard = initializeChessboard();
        printChessboard(chessboard);
    }
    // function to initialize the chessboard
    public static char[][] initializeChessboard()
    {
        char[][] board = new char[8][8];
        // initialize the chessboard with pieces
        board[0] = "♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜".toCharArray();
        board[1] = "♟ ♟ ♟ ♟ ♟ ♟ ♟ ♟".toCharArray();
        board[6] = "♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙".toCharArray();
        board[7] = "♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖".toCharArray();
        // fill the empty spaces with white and black squares
        for (int i = 2; i < 6; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if ((i + j) % 2 == 0)
                {
                    board[i][j] = '□'; // black square
                }
                else
                {
                    board[i][j] = '■'; // white square
                }
            }
        }
        return board;
    }
    // function to print the chessboard
    public static void printChessboard(char[][] board)
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
