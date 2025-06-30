Problem statement
You are given a binary matrix with ‘M’ rows and ‘N’ columns initially consisting of all 0s. 'Q' queries follow. The queries can be of 4 types:

Query 1: 1 R index
Query 2: 1 C index 
Query 3: 2 R index
Query 4: 2 C index

In each query, the first input is the type of the query, the second input is whether we have to consider the row ('R') or the column ('C') and the third input is the index of the row/column. 

For each type 1 query, we need to flip the elements of the row/column having the given index. 

For each type 2 query, we have to output the number of zeros present in the row/column having the given index. 
Note:
Note that the matrix is a binary matrix, meaning that it only contains either 0 or 1.
Example :
Given M = 3, N = 3, 
Queries : 1R1, 1R2, 2C1

So, in the above example the change in the matrix would look like this:
Example

Next query 2C1 will return the count of the number of zeroes in the 1st column: 1
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= M, N  <= 100
1 <= Q <= 1000
1 <= R <= M
1 <= C <= N
type = 1, 2

Time limit: 1 sec
Sample Input 1:
2
3 3
3
1R1
1R2
2C1
2 2
1
2R1
Sample Output 1:
1
2
Explanation of Sample Output 1:
In test case 1, Next query 2C1 will return the count of the number of zeroes in the 1st column: 1

The change in the matrix after the first and second queries would look like this:
Example

In test case 2, all the matrix elements are zero and hence the count of zeroes will be 2 for the first row.
Sample Input 2:
2
3 3
4
2C1
1R1
1R1
2R1
2 2
5
2C1
1R1
1R1
1R1
2R1
Sample Output 2:
3 3
2 0
Explanation of Sample Output 2:
In test case 1, 

First query 2C1 will return the count of the number of zeroes in the 1st column: 3

Next query 2R1 will return the count of the number of zeroes in the 1st column: 3

The change in the matrix after the second and third queries would look like this:
Example

In test case 2,

First query 2C1 will return the count of the number of zeroes in the 1st column: 2

Next query 2R1 will return the count of the number of zeroes in the 1st column: 0

The change in the matrix after the second and third queries would look like this:


------------------------------


public class Solution {
	public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Write your code here.

		String str;
		int count=0;
		int[] result;
		for(int i=0;i<q.length;i++)
		{
			if(q[i].charAt(0) == '2')
			{
				count++;
			}
		}
		result = new int[count];
		int k=0;
		int index;
		for(int i=0;i<q.length;i++)
		{
			str=q[i];
			if(str.charAt(0) == '1')
			{
				if(str.charAt(1) == 'R')
				{
					index = Integer.parseInt(str.substring(2));
					for(int j=0;j<mat[0].length;j++)
					{
						mat[index][j] = (mat[index][j] == 0) ? 1 : 0;
					}
				}
				else // 'C'
				{
					index = Integer.parseInt(str.substring(2));
					for(int r=0;r<mat.length;r++)
					{
						mat[r][index] = (mat[r][index] == 0) ? 1 : 0;
					}
				}
			}
			else //for 2
			{
				if(str.charAt(1) == 'R')
				{
					index = Integer.parseInt(str.substring(2));
					for(int j=0;j<mat[0].length;j++)
					{
						if(mat[index][j] == 0)
						{
							result[k]++;
						}
					}
					k++;
				}
				else  // 'C'
				{
					index = Integer.parseInt(str.substring(2));
					for(int r=0;r<mat.length;r++)
					{
						if(mat[r][index] == 0)
						{
							result[k]++;
						}
						
					}
					k++;
				}
			}
		}

		return result;
	}
}