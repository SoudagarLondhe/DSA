/*
 Problem statement
Given a binary number as an integer N, convert it into decimal and print.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7

 */


 import java.util.Scanner;

 public class Main {
     
     public static void main(String[] args) {
         // Write your code here
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int index=0;
         int result = 0;
         while(n > 0)
         {
             int rem = n%10;
             result = result + rem*calculatePow(2,index);
             index++;
             n=n/10;
         }
         System.out.println(result);
 
     }
 
     static int calculatePow(int num, int times)
     {
         int res=1;
         for(int i=1;i<=times;i++)
         {
             res = (res*num);
         }
         return res;
 
     }
 }
 


//  OPTIMIZED Solution : 

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int multiples=1;
		int result = 0;
		while(n > 0)
		{
			int rem = n%10;
			result = result + rem * multiples;
			multiples = multiples*2;

			n=n/10;
		}
		System.out.println(result);

	}

}


// For Power you can also use : 
int x = Math.pow(2,index)
e.g. 2^3
int x = Math.pow(2,3)
x = 8
