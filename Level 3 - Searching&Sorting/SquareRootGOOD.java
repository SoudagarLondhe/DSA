Problem statement
You are given a positive integer ‘N’. Your task is to find and return its square root. If ‘N’ is not a perfect square, then return the floor value of sqrt(N).



Note:
In case, if you are facing the test case failure, take the variables inside the function in 'unsigned int' data type.
Example:
Input: ‘N’ = 6

Output: 2

Explanation: The square root of the number 6 lies between 2 and 3, so the floor value is 2.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10 ^ 16

Time Limit: 1 sec.
Sample Input 1:
6
Sample Output 1:
2
Explanation of Sample Input 1:
The square root of the given number 6 lies between 2 and 3, so the floor value is 2.
Sample Input 2:
100
Sample Output 2:
10
Explanation of Sample Output 2:
The square root of the given number 100 is 10.

-------------------------
public class Solution {

    public static int sqrtN(long N) {
        if (N == 0 || N == 1) return (int) N;

        long low = 1, high = N;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (mid > N / mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) high;
    }
}

--------------------------------


//Using Binary search 

import java.util.*;

public class Solution {

    public static int sqrtN(long N) {
        long low = 1, high = N, mid;
        long ans;
        while (low <= high) 
        {
            mid = (low + high) / 2;

            ans = N/mid;
            if (mid == ans) 
            {
                return (int) mid;
            }
            else if (mid > ans) 
            {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return (int) (low-1);
    }
}



--------------------------------------------

Following code will work but as data type is log so when we do mid*mid i.e. long*long 
it will overflow and produces wrong result, so to prevent we do something like mid/N

import java.util.*;

public class Solution {

    public static int sqrtN(long N) {
        long low = 1, high = N, mid;

        while (low <= high) 
        {
            mid = (low + high) / 2;

            if (mid * mid == N) 
            {
                return (int) mid;
            }
            else if (mid * mid > N) 
            {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return (int) (low-1);
    }
}
----------------------------------------