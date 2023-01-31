package com.javaproblems;
/*

Conditional Statements


You have $12,000 to buy a car.
You're given a program which takes the price of car as an input.

Task
Output "yes" if the price is lower than or equal to 12,000.

Sample Input
11000

Sample Output
yes
Use the if statement to check the required condition.
*/
import java.util.Scanner;

public class ConditionalStatements  {

   public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       int price = scanner.nextInt();
       //complete the code
       System.out.println(price<=12000?"yes":"");
       scanner.close();
     
   }
}
