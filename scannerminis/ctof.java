import java.util.Scanner;

class ctof
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("HEY!! DIRTY BRIT!! HOW HOT IS IT IN YOUR NONSENSE UNITS?");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in FREEDOM UNITS: " + fahrenheit + "F");
    }
}