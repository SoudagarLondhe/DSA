/*
 Problem statement
Given a number N, find its square root. You need to find and print only the integral part of square root of N.

For eg. if number given is 18, answer is 4.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^8
Sample Input 1 :
10
Sample Output 1 :
3
Sample Input 2 :
4
Sample Output 2 :
2
 */


 import java.util.Scanner;

 public class Main {
     
     public static void main(String[] args) {
         // Write your code here
         Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
 
         int i=0;
         while(true)
         {
             if((i*i) > n)
             {
                 System.out.println(i-1);
                 break;
             }
             i++;
         }
 
     }
 }

 
//  More Optimised can be done using Binary Search
