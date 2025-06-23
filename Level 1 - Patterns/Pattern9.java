package Patterns;
import java.util.Scanner;

public class Pattern9
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
         
        for(int i=1;i<=n;i++)
        {
            char start = (char)('A'+(i-1));
            for(int j=1;j<=n;j++)
            {
                char x = (char) (start + (j-1));
                System.out.print(x);
            }
            System.out.println();
        }

        sc.close();
    }
}


// Enter a number
// 4
// ABCD
// BCDE
// CDEF
// DEFG


// ------------------------


// Pattern for N = 4
// A
// BC
// CDE
// DEFG


// for(int i=1;i<=N;i++)
// {
//     char start = (char)('A'+i-1);
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print(start);
//         start = (char)(start + 1);
//     }
//     System.out.println();
// }



// ------------------------------------

// Pattern for N = 5
// E
// ED
// EDC
// EDCB
// EDCBA


// int N = sc.nextInt();
// char x;
// for(int i=1;i<=N;i++)
// {
//     x = (char) ('A'+N-1);
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print(x);
//         x = (char) (x - 1);
//     }
//     System.out.println();
// }



// --------------------------------------


// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE


// for(int i=1;i<=N;i++)
// {
//     char start = (char) ('A'+N-i);
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print(start);
//         start=(char)(start + 1);
//     }
//     System.out.println();
// }


// -------------------------------------

// Pattern for N = 4
// 4444
// 333
// 22
// 1




// for(int i=1;i<=N;i++)
// {
//     for(int j=1;j<=(N-i+1);j++)
//     {
//         System.out.print(N-i+1);
//     }
//     System.out.println();
// }