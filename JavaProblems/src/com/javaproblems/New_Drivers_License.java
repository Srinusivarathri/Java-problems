package com.javaproblems;
/*

You have to get a new driver's license and you show up at the office at 
the same time as 4 other people. The office says that they will see 
everyone in alphabetical order and it takes 20 minutes for them to 
process each new license. All of the agents are available now, and 
they can each see one customer at a time. How long will it take for
you to walk out of the office with your new license?

Task 
Given everyone's name that showed up at the same time, 
determine how long it will take to get your new license.

Input Format 
Your input will be a string of your name, then an integer 
of the number of available agents, and lastly 
a string of the other four names separated by spaces.

Output Format 
You will output an integer of the number of minutes that 
it will take to get your license.

Sample Input
'Eric'
2
'Adam Caroline Rebecca Frank'

Sample Output 
40

Eric
2
Adam Caroline Rebecca Frank
*/

import java.util.*;
public class New_Drivers_License {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        int i=Integer.parseInt(sc.nextLine());
        String s2=sc.nextLine();
        String s21[]=s2.split(" ");
        //System.out.println(s2);
        ArrayList<String> a= new ArrayList<String>();
         a.add(s1);
        for(String s:s21){
            //System.out.println(s);
            a.add(s);
        }
        a.add(s1);
        Collections.sort(a);
        //System.out.println(a);
        int b=(a.indexOf(s1)/i)*20+20;
        System.out.println(b);
        sc.close();
    }
}
