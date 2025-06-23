package Patterns;
import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}



// Enter the number:5
//     *
//    **
//   ***
//  ****
// *****



// ---------------------------------


// Pattern for N = 4

//    1
//   12
//  123
// 1234



// for(int i=1;i<=N;i++)
// {
//     for(int j=1;j<=(N-i);j++)
//     {
//         System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print(j);
//     }
//     System.out.println();
// }



