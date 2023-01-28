package com.javaproblems;
/*
Average Word Length

You are in a college level English class, your professor wants you to write an essay, but you need to find out the average length of all the words you use. It is up to you to figure out how long each word is and to average it out.

Task: 
Takes in a string, figure out the average length of all the words and return a number representing the average length. Remove all punctuation. Round up to the nearest whole number.

Input Format: 
A string containing multiple words.

Output Format: 
A number representing the average length of each word, rounded up to the nearest whole number.

Sample Input: 
this phrase has multiple words

Sample Output: 
6

Explanation:
The string in question has five words with a total of 26 letters (spaces do not count). The average word length is 5.20 letters, rounding it up to the nearest whole numbers results in 6.
*/

import java.util.*;
public class Average_Word_Length {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String a=s.nextLine();
        String b[]=a.split(" ");
        int c=0;
        for(String a1:b){
            c=c+a1.length();
        }
        int d=c/b.length;
        if(d==3){
            System.out.println(d);
        }
        else{
            System.out.println(d+1);
        }
        s.close();
    }
}