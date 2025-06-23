package Patterns;
import java.util.Scanner;

public class Pattern7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count;
      
        for(int i=1;i<=n;i++)
        {
            count=i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}


// Enter a number
// 4
// 1
// 23
// 345
// 4567

// -----------------------
//On more pattern :
// Enter a number : 5
// 5 
// 5 4 
// 5 4 3 
// 5 4 3 2 
// 5 4 3 2 1


// int N = scanner.nextInt();
        
// for(int i=N;i>0;i--)
// {
//     for(int j=N;j>=i;j--)
//     {
//         System.out.print(j+" ");
//     }
//     System.out.println();
// }

// ---------------------------------

// Pattern for N = 4
// 1
// 21
// 321
// 4321



// for(int i=1;i<=N;i++)
// {
//     for(int j=i;j>=1;j--)
//     {
//         System.out.print(j);
//     }
//     System.out.println();
// }

