Problem statement
You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.

Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.



Note:
You need not print the array. You only need to populate it.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4

Time Limit: 1sec
Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2
Explanation of Sample Input 1 :
Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
Sample Input 2 :
2
9
3
Sample Output 2 :
1 3 5 7 9 8 6 4 2
1 3 2


---------------------------------------



public class Solution {
    
    public static void arrange(int[] arr, int n) {
    	//Your code goes here

        int i=0,j=n-1;
        for(int k=1;k<=arr.length;k++)
        {
            if(k%2!=0)
            {
                arr[i]=k;
                i++;
            }
            else
            {
                arr[j]=k;
                j--;

            }
        }
    }
}