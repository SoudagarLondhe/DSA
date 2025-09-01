Problem statement
Given an integer array (of length n), find and return all the subsets of input array.

NOTE- Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.

Note :
The order of subsets are not important.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 

-------------------------------------------------


public class solution {

	// Return a 2D array that contains all the subsets
	public static String[] countIt(int[] input,int startIndex,int[][] resArray)
	{
		if(startIndex == input.length-2)
		{
			String[] binaryArray = {"00","01","10","11"};
			resArray[0]=new int[0];
			for(int i=1;i<binaryArray.length;i++)
			{
				String eachBinary=binaryArray[i];
				int count=0;
				for(int j=0;j<eachBinary.length();j++)
				{
					if(eachBinary.charAt(j)=='1')
					{
						count++;
					}
				}
				resArray[i]=new int[count];
				int k=0;
				for(int j=0;j<eachBinary.length();j++)
				{
					if(eachBinary.charAt(j) == '1')
					{
						resArray[i][k]=input[j+startIndex];
						k++;
					}
				}
			}
			return binaryArray;
		}


		String[] returnedBinaryArray =  countIt(input,startIndex+1,resArray);
		
		String[] newBinaryArray = new String[returnedBinaryArray.length*2];
		for(int i=0;i<newBinaryArray.length/2;i++)
		{
			newBinaryArray[i]="0"+returnedBinaryArray[i];
		}
		for(int j=newBinaryArray.length/2,i=0;j<newBinaryArray.length;j++,i++)
		{
			newBinaryArray[j]="1"+returnedBinaryArray[i];
		}
		//
		for(int i=1;i<newBinaryArray.length;i++)
		{
			String eachBinary=newBinaryArray[i];
			int count=0;
			for(int j=0;j<eachBinary.length();j++)
			{
				if(eachBinary.charAt(j)=='1')
				{
					count++;
				}
			}
			resArray[i]=new int[count];
			int k=0;
			for(int j=0;j<eachBinary.length();j++)
			{
				if(eachBinary.charAt(j) == '1')
				{
					resArray[i][k]=input[j+startIndex];
					k++;
				}
			}
		}

		return newBinaryArray ;


	}
	public static int[][] subsets(int input[])
	{
		// Write your code here
		int resLength = (int)Math.pow(2,input.length);
		int[][] resArray = new int[resLength][];
		// String[] binaryArray = {"00","01","10","11"};
		String[] newBinaryArray= countIt(input,0,resArray);
		return resArray;
	}
}
