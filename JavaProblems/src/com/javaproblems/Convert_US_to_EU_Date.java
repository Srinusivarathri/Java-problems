package com.javaproblems;
/*
Convert US date to EU date

You and your friends are going to Europe! You have made plans to travel around Europe with your friends, but one thing you need to take into account so that everything goes according to play, is that the format of their date is different than from what is used in the United States. Your job is to convert all your dates from MM/DD/YYYY to DD/MM/YYYY.

Task: 
Create a function that takes in a string containing a date that is in US format, and return a string of the same date converted to EU.

Input Format: 
A string that contains a date formatting 11/19/2019 or November 19, 2019.

Output Format: 
A string of the same date but in a different format: 19/11/2019.

Sample Input: 
7/26/2019

Sample Output: 
26/7/2019

*/
import java.util.*;
import java.text.*;
public class Convert_US_to_EU_Date {
    public static void main(String[] args) {
        String inputDateString = new Scanner(System.in).nextLine();
        SimpleDateFormat inputFormat1 = new SimpleDateFormat("MMMM d, yyyy");
        SimpleDateFormat inputFormat2 = new SimpleDateFormat("MM/d/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("d/M/yyyy");
        try {
            System.out.println(format2.format(inputFormat1.parse(inputDateString)));
        } catch (ParseException p) {
            try {
                System.out.println(format2.format(inputFormat2.parse(inputDateString)));
            } catch (ParseException ignored) {
            }
        }
    }
}