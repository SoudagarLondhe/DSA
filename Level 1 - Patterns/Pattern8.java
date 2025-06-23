package Patterns;
import java.util.Scanner;

public class Pattern8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
       
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                char x =(char)(j+64);
                System.out.print(x);

                // Following also works:
                // char jthChar = (char)('A' + j - 1);
                // System.out.print(jthChar);
            }
            System.out.println();
        }
        sc.close();
    }
}


// Enter a number
// 7
// ABCDEFG
// ABCDEFG
// ABCDEFG
// ABCDEFG
// ABCDEFG
// ABCDEFG
// ABCDEFG


// ------------------------------

// Pattern for N = 3
//  A
//  BB
//  CCC


//  for(int i=1;i<=N;i++)
//  {
//      for(int j=1;j<=i;j++)
//      {
//          char x = (char)('A'+i-1);
//          System.out.print(x);
//      }
//      System.out.println();
//  }

