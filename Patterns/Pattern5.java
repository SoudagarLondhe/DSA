package Patterns;
import java.util.Scanner;

public class Pattern5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((j+1));
            }
            System.out.println();
        }

        sc.close();
    }
}


// Enter a number
// 4
// 1
// 12
// 123
// 1234