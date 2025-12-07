
/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String[] args){
        int n=5;  //total rows
        
        for (int i=n; i>=1; i--){
        for (int j=1; j<=i; j++) {
            System.out.print(j);
            
        }
        System.out.println();
        }
    }
}