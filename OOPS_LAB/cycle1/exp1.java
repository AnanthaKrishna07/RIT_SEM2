/*Write a Java program to check whether an input number is even or odd. 
1. Take an integer as input from the user.
 2. Use an if-else statement to check if the number is even or odd.
 3. Print the result accordingly.*/

import java.util.Scanner;
  public class EvenOdd{
  public static void main(String[] args){
   Scanner s=new Scanner(System.in);
   System.out.print("Enter the number:");
   int num = s.nextInt();
   if(num%2==0)System.out.println("Even");
   else System.out.println("Odd");
   }
 }
