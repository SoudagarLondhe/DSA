Problem statement
Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.

Do this recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
Sample Input 2 :
3
9 8 10
2
Sample Output 2 :
false



------------------------------------------------

public class Solution {
	
	public static boolean checkIt(int arr[],int index, int x)
	{
		if(index == arr.length)
		{
			return false;
		}

		if(arr[index] == x)
		{
			return true;
		}

		return checkIt(arr,index+1,x);
	}
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return checkIt(input,0,x);
		
	}
}

