package Patterns;
import java.util.Scanner;

public class Pattern6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(count+1);
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
// 456
// 78910