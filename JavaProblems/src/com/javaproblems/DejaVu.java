package com.javaproblems;
/*
You aren't paying attention and you accidentally type a bunch of random letters on your keyboard. You want to know if you ever typed the same letter twice, or if they are all unique letters.

Task: 
If you are given a string of random letters, your task is to evaluate whether any letter is repeated in the string or if you only hit unique keys while you typing.

Input Format: 
A string of random letter characters (no numbers or other buttons were pressed).

Output Format: 
A string that says 'Deja Vu' if any letter is repeated in the input string, or a string that says 'Unique' if there are no repeats.

Sample Input: 
aaaaaaaghhhhjkll

Sample Output: 
Deja Vu

Explanation: 
Your program should output 'Deja Vu' because there are many repetitions in 'aaaaaaaghhhhjkll'.

*/


import java.util.Scanner;

public class DejaVu {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        String a=s.nextLine();
        int b[]=new int[26];
        String c="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<a.length();i++){
            char d=a.charAt(i);
            int q=c.indexOf(d)+1;
            b[q]++;
        }
        int su=0;
        for (int i=0;i<26;i++){
            if(b[i]>1){
                //System.out.println (i+" "+b[i]);
                su+=1;
                //System.out.println (i+" "+su);
            }
        }
        if(su>=1){
            System.out.println ("Deja Vu");
        }
        else{
            System.out.println ("Unique");
        }
        s.close();
    }
}