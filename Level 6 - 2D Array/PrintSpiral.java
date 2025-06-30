Problem statement
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:

a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.

Refer to the Image:
Spiral path of a matrix

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30 




------------------------------------
More readability =>

public class Solution {

    public static void spiralPrint(int arr[][]){
        // Check for empty array
        if (arr == null || arr.length == 0 || arr[0].length == 0) return;

        int rows = arr.length;
        int cols = arr[0].length;
        int total = rows * cols;
        int elements = 0;
        int rowStart = 0, rowEnd = rows - 1;
        int colStart = 0, colEnd = cols - 1;

        while (elements < total) {
            // Print first row (left to right)
            for (int j = colStart; j <= colEnd && elements < total; j++) {
                System.out.print(arr[rowStart][j] + " ");
                elements++;
            }
            rowStart++;

            // Print last column (top to bottom)
            for (int i = rowStart; i <= rowEnd && elements < total; i++) {
                System.out.print(arr[i][colEnd] + " ");
                elements++;
            }
            colEnd--;

            // Print last row (right to left)
            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart && elements < total; j--) {
                    System.out.print(arr[rowEnd][j] + " ");
                    elements++;
                }
                rowEnd--;
            }

            // Print first column (bottom to top)
            if (colStart <= colEnd) {
                for (int i = rowEnd; i >= rowStart && elements < total; i--) {
                    System.out.print(arr[i][colStart] + " ");
                    elements++;
                }
                colStart++;
            }
        }
    }
}

------------------------------------

public class Solution {

	public static void spiralPrint(int arr[][]){
		//Your code goes here

        if (arr == null || arr.length == 0 || arr[0].length == 0) return;

		int rows = arr.length;
		int cols = arr[0].length;
		int total = rows*cols;
		int elements=0;
		int rowStart = 0, rowEnd = arr.length-1;
		int colStart = 0, colEnd = arr[0].length-1;
		int i=0,j=0;

		while(elements < total)
		{
			for(j=colStart;j<=colEnd && elements < total ;j++)
			{
				System.out.print(arr[i][j]+" ");
				elements++;
				// j++;
			}
			
			j=colEnd;
			for(i=rowStart+1;i<=rowEnd && elements < total ;i++)
			{
				System.out.print(arr[i][j]+" ");
				elements++;
				// i++;
			}

			i=rowEnd;
			for(j=colEnd-1;j>=colStart && elements < total;j--)
			{
				System.out.print(arr[i][j]+" ");
				elements++;
				// j--;
			}

			j=colStart;
			for(i=rowEnd-1;i>rowStart && elements < total ;i--)
			{
				System.out.print(arr[i][j]+" ");
				elements++;
				// i--;
			}

			colStart++;
			colEnd--;
			rowStart++;
			rowEnd--;

			i++;
			j++;
		}


	}
}