
/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args){
        int n=5;  //number of rows
        
     for(int i=1; i<=n; i++) {    //print spaces
     for(int s=1; s<=n-i; s++) {
        System.out.print(" ");
    }
    //print numbers
    for (int j=1; j<=i; j++){
        System.out.print(j);
    }
    System.out.println();
}}
         
}