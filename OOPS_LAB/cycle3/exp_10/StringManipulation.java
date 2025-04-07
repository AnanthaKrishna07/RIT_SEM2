/*Write a Java program to perform various string manipulations, including finding the
length, converting to uppercase and lowercase, extracting characters and sub strings, and
reversing the string*/

import java.util.Scanner;
public class StringManipulation{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=s.nextLine();
        int length=str.length();
        System.out.println("Length of the string: "+length+"");
        System.out.println("Uppercase of the string: "+str.toUpperCase()+"");
        System.out.println("Uppercase of the string: "+str.toLowerCase()+"");
        System.out.println("Enter the index of string to extract: ");
        int index=s.nextInt();
        if(index>=0 && index<=length){
            System.out.println("The character extracted at "+index+" is "+str.charAt(index)+"");
        }
        else{
            System.out.println("Ivalid index");
        }
        System.out.println("Enter the start and end points of the substring");
        int start=s.nextInt();
        int end=s.nextInt();
        if(start>=0 && end<=length && start < end ){
            System.out.println("Substring of the string: "+str.substring(start,end)+"");
        }
        else{
            System.out.println("Invalid start and end points");
        }
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println("Reverse of the string: "+reversed+"");
        s.close();
    }
}
