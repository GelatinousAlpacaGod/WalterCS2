import java.util.Scanner;

class money 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ya money in USD: ");
        double usdAmount = scanner.nextDouble();
        double rubAmount = usdAmount * 75;
        System.out.println("in russian rubles, you only got " + rubAmount + " rubles. ew. get ya money up not, ya funny up big man");
    }
}