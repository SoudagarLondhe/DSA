/*
 Problem statement
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).



If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 12
Sample Input 1 :
10
1
Sample Output 1 :
55
Sample Input 2 :
10
2
Sample Output 2 :
3628800
Sample Input 3 :
10
4
Sample Output 3 :
-1
 */


 import java.util.Scanner;

 public class Sum_or_product {
     
     public static void main(String[] args) {
         // Write your code here
 
         Scanner sc = new Scanner (System.in);
         int N = sc.nextInt();
         int C = sc.nextInt();
         int sum = 0;
         int mul = 1; 
 
         if(C == 1)
         {
             for(int i=1;i<=N;i++)
             {
                 sum += i;
             }
             System.out.print(sum);
         }
         else if (C==2)
         {
             for(int i=2;i<=N;i++)
             {
                 mul *= i;
             }
             System.out.print(mul);
         }
         else {
             System.out.print("-1");
         }
 
     }
 }
 
