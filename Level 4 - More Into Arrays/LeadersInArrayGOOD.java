Problem statement
Given an integer array A of size n. Find and print all the leaders present in the input array. An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].

Print all the leader elements separated by space and in the same order they are present in the input array.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^6

Sample Input 1 :
6
3 12 34 2 0 -1
Sample Output 1 :
34 2 0 -1
Sample Input 2 :
5
13 17 5 4 6
Sample Output 2 :
17 6





-------------------------------------------




public class Solution {

	public static void leaders(int[] input) {
	
		int result[] = new int[input.length];
		int k=0;
		int max = Integer.MIN_VALUE;
		for(int i=input.length-1;i>=0;i--)
		{
			if(input[i] >= max)
			{
				max = input[i];
				result[k] = input[i];
				k++;
			}
		}

		for(int j=k-1;j>=0;j--)
		{
			System.out.print(result[j]+" ");
		}
		
	}
	
}