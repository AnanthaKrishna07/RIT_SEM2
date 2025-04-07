/*Write a Java program to store ‘n‘ strings in an array. Search for a given string. If
found, print its index; otherwise, display ’String not found’.*/

import java.util.Scanner;
public class StringSearch {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number of strings: ");
 int n = sc.nextInt();
 sc.nextLine();
 String[] strings = new String[n];
 System.out.println("Enter " + n + " strings:");
 for (int i = 0; i < n; i++) {
 strings[i] = sc.nextLine();
 }
 System.out.print("Enter string to search: ");
 String searchString = sc.nextLine();
 int index = -1;
 for (int i = 0; i < n; i++) {
 if (strings[i].equals(searchString)) {
 index = i;
 break;
 }
 }
 if (index != -1) {
 System.out.println("String found at index: " + index);
 } else {
 System.out.println("String not found.");
 }
 sc.close();
 }
}
