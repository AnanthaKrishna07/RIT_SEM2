/* Write a Java program to compute the sum of the first n natural numbers. 
1. Take an integer n as input from the user.
 2. Use either a for loop or a while loop to compute the sum.
 3. Print the result.*/

 import java.util.Scanner;
   public class sumOfn{
   public static void main ( String[] args){
   Scanner scanner = new Scanner(System .in);
   System.out.print("Enter a number n:");
   int n = scanner.nextInt();
   int sum = 0;
   for(int i = 1; i <= n ; i++){
     sum += i ;}System.out.println("The sum of the first " + n + "numbers is: " + sum);
   }
 }
