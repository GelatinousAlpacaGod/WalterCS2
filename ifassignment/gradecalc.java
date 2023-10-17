import java.util.Scanner;

public class gradecalc
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numerical grade (0-100): ");
        int numericalGrade = scanner.nextInt();
        if (numericalGrade < 0 || numericalGrade > 100) 
        {
            System.out.println("Invalid input. Please enter a grade between 0 and 100.");
        } 
        else {
            String letterGrade;

            if (numericalGrade >= 90) 
            {
                letterGrade = "A";
            }
             else if (numericalGrade >= 80) 
             {
                letterGrade = "B";
            }
             else if (numericalGrade >= 70) 
             {
                letterGrade = "C";
            }
             else if (numericalGrade >= 60) 
             {
                letterGrade = "D";
            }
             else 
             {
                letterGrade = "F";
            }
            System.out.println("Your letter grade is: " + letterGrade);
        }
    }
}
