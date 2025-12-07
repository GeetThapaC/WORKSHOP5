import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a positive integer");
        int num= sc.nextInt();
        int reversed =0;
        
        while (num> 0){
            int digit= num% 10;  //get last digit
            reversed = reversed * 10+ digit;  //reversed number
            num = num / 10;
            
        }
        System.out.println("reversed number:" + reversed);
        sc.close();
    }
}