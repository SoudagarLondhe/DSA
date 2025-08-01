Problem statement
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.

You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.

Note:
The sizes N and M can be different. 

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output array/list.
Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0 



------------------------------------


public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
        int i=arr1.length-1,j=arr2.length-1;
        int k;
        if(arr1.length > arr2.length)
        {
            k=arr1.length;
        }
        else
        {
            k=arr2.length;
        }
        int[] result = new int[k+1];
        k=result.length-1;
        int total,carry=0;
        while(i>=0 && j>=0)
        {
            total = arr1[i]+arr2[j]+carry;
            result[k]=total%10;
            carry = total/10;

            i--;
            j--;
            k--;
        }

        while(i>=0)
        {
             total = arr1[i]+carry;
             result[k]=total%10;
             carry = total/10;
             i--;
             k--;
        }

        while(j>=0)
        {
             total = arr2[j]+carry;
             result[k]=total%10;
             carry = total/10;
             j--;
             k--;
        }
        result[0]=carry;

        for (int x = 0; x < result.length; x++) {
            output[x] = result[x];
        }
    }

}