import java.util.Scanner;

/**
 * Write a description of class Q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q8
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int num = sc.nextInt();
        
        System.out.println("Multiplication table of "+ num);
        System.out.println("-");
        // generate table using loop
        for (int i=1; i<=10; i++)
        {
            System.out.println(num + "x" +i+ "=" + (num * i));
        }
        System.out.println("-");
    }
        }