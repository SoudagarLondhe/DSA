Problem statement
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in the output array (in increasing order).

Do this recursively. Indexing in the array starts from 0.

Hint:
Try making a helper function with the required arguments and call the helper function from the allIndexes function.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4


-----------------------------------



public class Solution {

    public static int searchAll(int[] input,int i, int[] output, int j,int x)
    {
        if(i==input.length)
        {
            return j;
        }
        if(input[i] == x)
        {
            output[j]=i;
            j++;
        }
        return searchAll(input,i+1,output,j,x);
    }
	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

        int[] output = new int[input.length];
       int j = searchAll(input,0,output,0,x);
        int[] res = new int[j];
        for(int i=0;i<j;i++)
        {
            res[i]=output[i];

        }
        return res;
		
	}
	
}