Problem statement
You are given a 2D list (array) with dimensions N rows and M columns, filled with integers. Your task is to find the row or column that has the largest sum of its elements.

Important Rules:
- If two or more rows/columns have the same sum, choose the one that comes first.
- If a row and a column have the same largest sum, choose the row.
Goal: Return which row or column has the largest sum.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
1 <= N <= 10^3
1 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
3 2
6 9 
8 5 
9 2 
Sample Output 1:
column 0 23
Sample Input 2:
1
4 4
6 9 8 5 
9 2 4 1 
8 3 9 3 
8 7 8 6 
Sample Output 2:
column 0 31







--------------------------------------

// As question says row has more priority also from the many row the FIFO row has most proprity
// that's why calculating the row sum and updating it and then doing the col sum checking


public class Solution {

	public static void findLargest(int mat[][]){
		//Your code goes here
        if (mat.length == 0 || mat[0].length == 0) 
        {
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }
		String str="";
		int max=Integer.MIN_VALUE;
		int sum;
		int index=0;

		int[] colSums = new int[mat[0].length];
		for(int i=0;i<mat.length;i++)
		{
			sum=0;
			for(int j=0;j<mat[0].length;j++)
			{
				sum=sum+mat[i][j];
				colSums[j]=colSums[j]+mat[i][j];
			}
			if(sum > max)
			{
				max=sum;
				index = i;
				str="row";
			}
		}

		for(int k=0;k<colSums.length;k++)
		{
			if(colSums[k] > max)
			{
				max=colSums[k];
				str="column";
				index=k;
			}
		}

		System.out.println(str+" "+index+" "+max);
	}
}