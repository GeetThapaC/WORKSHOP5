import java.util.Scanner;

/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char choice = 'y';      // to control the loops
        
        while(choice == 'y' || choice == 'Y') {
            
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enterthe second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Choose the operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result = 0;
            boolean valid = true;

            switch(op) {
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': 
                    if(num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
                    valid = false;
            }

            if(valid) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("Program ended.");
        sc.close();
    }
}
