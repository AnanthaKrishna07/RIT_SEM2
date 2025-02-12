/* Write a Java program to compute the factorial of a given number. 
1. Take an integer as input from the user.
 2. Compute the factorial using either a for loop or a while loop.
 3. Print the result.*/

 import java.util.Scanner;
   public class fact{
     public static void main ( String[] args){
       Scanner scanner = new Scanner(System .in);
       System.out.print("Enter a number n:");
       int n = scanner.nextInt();
       int f = 1;
        for(int i = 1; i <= n ; i++){
           f = f * i ;}System.out.println("The factorial of  " + n + " is: " + f);
        }
      }
}
