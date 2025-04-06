/*Write a Java program to compute the factorial of a given number*/

import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        System.out.print("Enter your Mark: ");
        Scanner s=new Scanner(System.in);
        int mark=s.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("Grade S");
        }
        else if(mark>=80 && mark<=90){
            System.out.println("Grade A");
        }
        else if(mark>=70 && mark<=80){
            System.out.println("Grade B");
        }
        else if(mark>=60 && mark<=70){
            System.out.println("Grade C");
        }
        else if(mark>=50 && mark<=60){
            System.out.println("Grade D");
        }
        else if(mark>=40 && mark<=50){
            System.out.println("Grade E");
        }
        else if(mark<40){
            System.out.println("Failed");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
