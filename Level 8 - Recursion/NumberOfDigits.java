Problem statement
You are given a number 'n'.



Return number of digits in 'n'.



Example:
Input: 'n' = 123

Output: 3

Explanation:
The 3 digits in '123' are 1, 2 and 3. 


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
121


Sample Output 1:
3


Explanation of sample output 1:
There are 3 digits in 121 are 1,2 and 1.


Sample Input 2:
38


Sample Output 2:
2


Expected time complexity :
The expected time complexity is O(log n).


Constraints:
1 <= 'n' <= 10^9


---------------------------------

public class Solution {
    public static int countDigits(int n)
    {
        // Write your code here.

        if(n==0)
        {
            return 0;
        }

        return 1+countDigits(n/10);
    }
}
