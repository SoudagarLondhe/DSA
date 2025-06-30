Problem statement
You are given a two-dimensional square matrix of size N×N. You need to find the sum of the elements on:

The main diagonal (from the top-left corner to the bottom-right corner).
The secondary diagonal (from the top-right corner to the bottom-left corner).
All the boundary elements of the matrix
Make sure that no element is counted more than once, even if it belongs to both diagonals or is a boundary element. Your task is to compute the sum of all these unique elements.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1sec
Sample input 1:
1
3
1 2 3
4 5 6
7 8 9
Sample Output 1:
45
Explanation for Sample Output 1:
The boundary elements are 1, 2, 3, 6, 9, 8, 7 and 4. 

The first-diagonal elements are 1, 5 and 9. 

The second-diagonal elements are 3, 5 and 7.

We just need to add all these numbers making sure that no number is added twice. For example, '1' is both a boundary element and a first-diagonal element similarly, '5' contributes to both the diagonals but they won't be added twice.

Hence, we add up, [1 + 2 + 3 + 6 + 9 + 8 + 7 + 4 + 5] to give 45 as the output.
Sample input 2:
2
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
4
1 2 3 10
4 5 6 11
7 8 9 12
13 14 15 16
Sample Output 2:
273
136




-------------------------------


public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		if(mat == null || mat.length == 0)
		{
			System.out.println(0);
			return;
		}

		int n=mat.length, sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( i==0 || i==n-1 || j==0 || j==n-1 || (i+j)==n-1 || i==j)
				{
					sum=sum+mat[i][j];
				}
			}
		}
		System.out.println(sum);
	}

}

-------------------------------

public class Solution {

	public static void totalSum(int[][] mat) {
		//Your code goes here
		if(mat == null || mat.length == 0)
		{
			System.out.println(0);
			return;
		}

		int[][] visited = new int[mat.length][mat[0].length];
		int sum=0;
		for(int j=0;j<mat[0].length;j++)
		{
			if(visited[0][j]!=1)
			{
				sum=sum+mat[0][j];
				visited[0][j]=1;
			}
		}

		for(int i=0;i<mat.length;i++)
		{
			if(visited[i][ mat[0].length-1 ] != 1 )
			{
				sum=sum+mat[i][ mat[0].length-1 ];
				visited[i][ mat[0].length-1 ] = 1;
			}
		}

		for(int j=mat[0].length-1; j>=0 ; j--)
		{
			if(visited[mat.length-1][j] != 1 )
			{
				sum=sum+mat[ mat.length - 1][ j ];
				visited[mat.length-1][j] = 1;
			}
		}

		for(int i=mat.length-1; i>=0; i--)
		{
			if(visited[i][0] != 1)
			{
				sum=sum+mat[i][0];
				visited[i][0] = 1;
			}
		}

		for(int i=0;i<mat.length;i++)
		{
			if(visited[i][i] != 1)
			{
				sum=sum+mat[i][i];
				visited[i][i]=1;
			}
		}

		for(int i=0, j=mat.length-1; i<mat.length;i++,j--)
		{
			if(visited[i][j] != 1)
			{
				sum=sum+mat[i][j];
				visited[i][j]=1;
			}
		}

		System.out.println(sum);

	}

}