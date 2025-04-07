/*
Problem statement
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

Print the prime numbers in different lines.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19

 */



 import java.util.Scanner;

 public class Prime {
 
     public static void main(String[] args) {
         
         /* Your class should be named Solution.
          * Read input as specified in the question.
          * Print output as specified in the question.
         */
 
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int flag = 0;
 
         System.out.println("2");
         for(int i=3;i<=n;i++)
         {
             flag = 0;
             for(int j=2;j<i;j++)
             {
                 if(i%j == 0)
                 {
                     flag = 1;
                     break;
                 }
             }
             if(flag == 0)
             {
                 System.out.println(i);
             }
         }
         
         
     }
 }
 

/* 
 Enchanced solution : 
 import java.util.Scanner;

public class PrimeNumbersInRange {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

*/