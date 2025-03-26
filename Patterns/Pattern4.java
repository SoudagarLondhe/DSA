package Patterns;
import java.util.Scanner;

public class Pattern4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=4;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}


// Enter a number
// 4
// 4321
// 4321
// 4321
// 4321