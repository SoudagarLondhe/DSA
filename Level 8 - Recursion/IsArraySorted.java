Problem statement
You are given an array ‘A’ of length ‘N’ , determine whether the array is sorted in non-decreasing order or not.



Example:
Input:
A = [1, 3, 6, 10]
Output:
True
Explanation: Since array ‘A’ is sorted, therefore output is ‘True’.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
5
10 20 30 20 40
Sample Output 1:
False
Explanation Of Sample Input 1:
A = [10, 20, 30, 20, 40]
Since array ‘A’ is not sorted, therefore output is ‘False’.
Sample Input 2:
1
1100
Sample Output 2:
True
Constraints:
1 <= N  <= 10^5
1 <= A[i] <= 10^9


--------------------------------


public class Solution {

    public static boolean checkIt(int[] arr, int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] > arr[i+1])
        {
            return false;
        }
        return checkIt(arr,i+1);
    }
    public static boolean arraySortedOrNot(int []A, int N) 
    {
        if (N == 0 || N == 1) {
            return true;
        }
       return checkIt(A,0);
    }
}
