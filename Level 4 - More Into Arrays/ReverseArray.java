Problem statement
Given an array ‘ARR’ of size ‘N’. You are also given two indices ‘L’ and ‘R’.

Your task is to reverse the ‘ARR’ from index ‘L’ to ‘R’ inclusive.

Example:
Input:
‘N’ = 3 ‘L’ = 0 ‘R’ = 1 ‘ARR’ = [1, 2, 3]


Output: 
2 1 3

Explanation:

When we reverse the elements between indices 0 and 1 we get the array as 2 1 3.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1  <= T <= 10
1  <= N <= 100000
0 <= L, R < N
1 <= ARR[i] <= 1e9
Time Limit: 1 sec
Sample Input 1:
2
3
0 1
1 2 3
2
0 1 
1 2
Sample Output 1:
2 1 3
2 1
Explanation Of Sample Input 1 :
Test 1:
When we reverse the elements between indices 0 and 1 we get the array as 2 1 3.

Test 2:
When we reverse the elements between indices 0 and 1 we get the array as 2 1.
Sample Input 2 :
2
5
0 3
21 6 46 36 10 
10
9 9
21 2 17 39 48 41 44 23 22 7 
Sample Output 2 :
36 46 6 21 10 
21 2 17 39 48 41 44 23 22 7




------------------------

public class Solution {
    public static int[] reverseBetween(int n, int l, int r, int []arr) {
        // Write your code from here.

        int temp;
        while(l<r)
        {
            temp = arr[l];
            arr[l]=arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
        return arr;
    }
}