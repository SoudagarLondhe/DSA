Problem statement
You have been given a random integer array/list(ARR) of size N. You are required to find and return the second largest element present in the array/list.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^2
1<=arr[i]<=10^3

Time Limit: 1 sec
Sample Input 1:
5
4 3 10 9 2
Sample Output 1:
9
Sample Input 2:
7
13 6 31 14 29 44 3
Sample Output 2:
31





---------------------------------------


public class Solution {  

    public static int secondLargestElement(int[] arr, int n) {
    	//Your code goes here

        int fl = Integer.MIN_VALUE,sl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i] > fl)
            {
                sl = fl;
                fl = arr[i];
            }
            else if(arr[i] > sl)
            {
                sl = arr[i];
            }
        }
        return sl;

    }

}