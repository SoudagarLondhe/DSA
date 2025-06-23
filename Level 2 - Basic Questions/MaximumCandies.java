Problem statement
You are given the array ‘children’ of size ‘N’ representing the number of candies present at each child. You have a ‘extraCandies’ amount of candies. Your task is to find for each child if the child has the most candies among all children if all ‘extraCandies’ are given to the child.

You have to return a boolean array. ‘True’ is present at position ‘index’ if the child at position ‘index’ will have the maximum amount of candies when given all the ‘extraCandies’ candies.

For example:
You are given ‘children’ = [12, 20, 5], and ‘extraCandies’ = ‘9’

If you give all the candies to the child at position 1, the child will have 21 candies, which is the highest among all children.

If you give all the candies to the child at position 2, the child will have 29 candies, which is the highest among all children.

If you give all the candies to the child at position 3, the child will have 14 candies, which is not the highest among all children.

Hence the answer is [True, True, False].
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
2 <= N <= 10^6
1 <= children[i] <= 10^9
1 <= extraCandies <= 10^9

Time Limit: 1 sec
Sample Input 1:
2
3 9
12 20 5
2 1
10 11
Sample Ouput 1:
True True False
True True
Explanation:
For the first test case, You are given children = [12, 20, 5], and extraCandies = 9

If you give all the candies to the child at position 1, they will have 21 candies, which is the highest among all children.

If you give all the candies to the child at position 2, they will have 29 candies, which is the highest among all children.

If you give all the candies to the child at position 3, they will have 14 candies, which is not the highest among all children.

Hence the answer is [True, True, False].

For the second test case, You are given children= [10, 11] and extraCandies = 1

If you give all the candies to the child at position 1, they will have 11 candies, which is equal to the highest among all children.

If you give all the candies to the child at position 2, they will have 12 candies, which is the highest among all children.

Hence the answer is [True, True].
Sample Input 2:
2
3 5
11 18 9
2 1
1 2
Sample Output2:
False True False
True True



--------------------------------


public class Solution {
    public static boolean[] maxCandies(int n, int[] children, int extraCandies) {
        // Write your code here
        boolean[] result = new boolean[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<children.length;i++)
        {
            if(children[i]>max)
            {
                max=children[i];
            }
        }
        for(int i=0;i<children.length;i++)
        {
            if((children[i]+extraCandies) >= max)
            {
                result[i] = true;
            }
            else
            {
                result[i] = false;
            }
        }
        return result;
    }
}

---------------------

