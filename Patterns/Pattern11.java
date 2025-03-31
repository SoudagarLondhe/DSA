package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=(i-1);j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}




// 5
//     1
//    121
//   12321
//  1234321
// 123454321

// ----------------------------




// 5
//     *
//    ***
//   *****
//  *******
// *********


// for(int i=1;i<=N;i++)
// {
//     for(int j=1;j<=(N-i);j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print("*");
//     }
//     for(int j=i-1;j>=1;j--)
//     {
//         System.out.print("*");
//     }
//     System.out.println();
// }


// ------------------------------
// 4

//    1
//   232
//  34543
// 4567654


// for(int i=1;i<=n;i++)
// {
//     for(int j=1;j<=(n-i);j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=i;j<=((2*i)-1);j++)
//     {
//         System.out.print(j);
//     }
//     for(int j=((2*i)-2);j>=i;j--)
//     {
//         System.out.print(j);
//     }
//     System.out.println();
// }


// -----------------------------------
// IMP : 
// N=5

//   *
//  *** 
// ***** 
//  *** 
//   * 




//   int N = sc.nextInt();
//   sc.close();

//   int N1=(N/2)+1;
//   int N2=(N-N1);

//   for(int i=1;i<=N1;i++)
//   {
//       for(int j=1;j<=(N1-i);j++)
//       {
//           System.out.print(" ");
//       }
//       for(int j=1;j<=((2*i) - 1);j++)
//       {
//           System.out.print("*");
//       }
//       System.out.println();
//   }
//   // For second set
//   for(int i=N2;i>=1;i--)
//   {
//       for(int j=1;j<=(N2-i+1);j++)
//       {
//           System.out.print(" ");
//       }
//       for(int j=1;j<=((2*i)-1);j++)
//       {
//           System.out.print("*");
//       }
//       System.out.println();
//   }

