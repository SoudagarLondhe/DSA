Problem statement
Given an array A of size n and an integer K, return all subsets of A which sum to K.

Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.


Note :
The order of subsets are not important.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 20

Sample Input :
9 
5 12 3 17 1 18 15 3 17 
6
Sample Output :
3 3
5 1



------------------------------------------------------

public class solution {

	// Return a 2D array that contains all the subsets which sum to k
    public static String[] findSubArrays(int[] input,int startIndex, int[][] subResultsArray)
	{
		if(startIndex == input.length-1)
		{
			String[] binaryString = {"0","1"};
			subResultsArray[0]=new int[0];
			subResultsArray[1]=new int[1];
			subResultsArray[1][0]=input[startIndex];
			return binaryString;
		}

		String[] returnedBinaryArray = findSubArrays(input,startIndex+1,subResultsArray);
	
		String[] updateBinaryArray = new String[returnedBinaryArray.length*2];
		for(int i=0,j=0;i<updateBinaryArray.length/2;i++,j++)
		{
			updateBinaryArray[i] = "0"+returnedBinaryArray[j];
		}
		for(int i=updateBinaryArray.length/2,j=0;i<updateBinaryArray.length;i++,j++)
		{
			updateBinaryArray[i] = "1"+returnedBinaryArray[j];
		}

		// Binary String array updated till here

		for(int i=1;i<updateBinaryArray.length;i++)
		{
			int count = 0;
            String eachString = updateBinaryArray[i];
			for(int j=0;j<eachString.length();j++)
			{
				if(eachString.charAt(j)=='1')
				{
					count++;
				}
			}

			subResultsArray[i] = new int[count];
			int k=0;
			for(int j=0;j<eachString.length();j++)
			{
				if(eachString.charAt(j) == '1')
				{
					subResultsArray[i][k]=input[j+startIndex];
					k++;
				}
			}
		}

		return updateBinaryArray;

	}

	public static int[][] subsetsSumK(int input[], int k) 
	{
		// Write your code here
        int subResultLength = (int) Math.pow(2,input.length);
		int[][] subResultsArray = new int[subResultLength][];
		String[] str = findSubArrays(input,0,subResultsArray);

		int sum,count=0;
		// System.out.println("SubArrays Result =>");
		for(int i=0;i<subResultsArray.length;i++)
		{
			sum=0;
			for(int j=0;j<subResultsArray[i].length;j++)
			{
				sum = sum + subResultsArray[i][j];
			}
			if(sum == k)
			{
				count++;
			}
		}

		int[][] result = new int[count][];
		int index=0;
		for(int i=0;i<subResultsArray.length;i++)
		{
			sum=0;
			for(int j=0;j<subResultsArray[i].length;j++)
			{
				sum = sum +subResultsArray[i][j];
			}
			if(sum == k)
			{
				result[index]=new int[subResultsArray[i].length];
				for(int j=0;j<subResultsArray[i].length;j++)
				{
					result[index][j]=subResultsArray[i][j];
				}
				index++;
			}
		}


		return result;

	}
}
