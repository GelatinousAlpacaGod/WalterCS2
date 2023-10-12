import java.util.Scanner;

class interestcalc
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter your yearly interest rate in percentage: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();
        rate = rate / 100;
        double simpleInterest = (principal * rate * time);
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
