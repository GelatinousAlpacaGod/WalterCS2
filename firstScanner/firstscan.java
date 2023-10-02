import java.util.Scanner;

class firstscan
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int additionResult = number + 5;
        int subtractionResult = additionResult - 3;
        int multiplicationResult = subtractionResult * 2;
        System.out.println("Original number= " + number);
        System.out.println("After addition (+ 5)= " + additionResult);
        System.out.println("After subtraction (- 3)3= " + subtractionResult);
        System.out.println("After multiplication (* 2)= " + multiplicationResult);
    }
}
