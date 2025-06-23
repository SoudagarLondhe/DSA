/*
 Problem statement
Write a program to generate the reverse of a given number N. Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.



Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N < 10^8
Sample Input 1 :
1234
Sample Output 1 :
4321
Sample Input 2 :
1980
Sample Output 2 :
891
 */


 import java.util.Scanner;
public class Reverse_a_number {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int count=1;
		while(n/10!=0)
		{
			count++;
			n=n/10;
		}
		int[] arr = new int[count];
		int i=0;
		while(m/10!=0)
		{
			arr[i]=m%10;
			i++;
			m=m/10;
		}
		arr[i]=m;
		// System.out.println("Printing array :");
		// for(i=0;i<arr.length;i++)
		// {
		// 	System.out.println(arr[i]);
		// }
        int zero_encounter = 0;
		for(i=0;i<arr.length;i++)
		{
			if(zero_encounter == 0 && arr[i]==0)
			{
				continue;
			}
			else
			{
				zero_encounter = 1;
				System.out.print(arr[i]);
			}
			
		}
		if(zero_encounter ==0)
		{
			System.out.print(0);
		}
          
	}
}




// Another solution without using array : 
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int count=0;
		while(n/10!=0)
		{
			count++;
			n=n/10;
		}

        int multiples=1;
		for(int i=0;i<count;i++ )
		{
			multiples = multiples*10;
		}
		int result = 0,rem;

		while(m/10 != 0)
		{
			rem = m%10;
			rem = rem*multiples;
			result = result + rem;
			multiples = multiples / 10;
			m=m/10;
		}
		result = result + m*multiples;
		System.out.println(result);
		
	}
}



// ===================================
//  GOOD Solution
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int rem;
		int result=0;
		while(n > 0)
		{
			rem = n%10;
			result = result*10 + rem;
			n=n/10;
		}
		System.out.println(result);

	}
}

