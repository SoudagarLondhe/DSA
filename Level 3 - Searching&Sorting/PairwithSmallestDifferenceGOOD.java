Problem statement
Given two unsorted arrays of non-negative integers, 'arr1' and 'arr2' of size 'N' and 'M', respectively. Your task is to find the pair of elements (one from each array), such that their absolute (non-negative) difference is the smallest, and return the min difference.

Example :
N = 3, arr1 = [10, 20, 30]
M = 2, arr2 = [17, 15]
The smallest difference pair is (20, 17) with an absolute difference of 3. So, the answer is 3.
Note :
Both the arrays are unsorted, and all array elements are non-negative integers.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N, M <= 1000
0 <= arr1[i], arr2[i] <=10^6

Time Limit: 1 second
Sample input 1 :
2
3 3
12 7 5
4 4 6
3 2
10 20 30 
17 15
Sample output 1 :
1
3
Explanation For Sample Input 1 :
Test Case 1 :
The smallest difference pairs are (7, 6) and (5, 6) with an absolute difference of 1, so the answer is 1.

Test Case 2 :
The smallest difference pair is (20, 17) with an absolute difference of 3, so the answer is 3.
Sample input 2 :
2
4 4
1 5 12 3
16 9 10 20
2 4
20 10
10 13 19 16
Sample output 2 :
2
0

-------------------------------
Optimized : Better solution
Using Two pointer, as elements are sorted and if array1 element is smaller than array2,
increment the pointer of only array1 to bring the value closer to array2 
Similarly, if array1 value is bigger(or much bigger) than array2 value increment the pointer of 
only array2 to bring the value closer to array1

import java.util.*;
public class Solution {

    
    public static int absoluteDiff(int first,int second)
    {
        int sub = first - second;
        if(sub < 0)
        {
            sub = -sub;
        }
        return sub;
    }

    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int diff = Integer.MAX_VALUE;
        int res;
        int i=0,j=0;

        while(i < arr1.length && j<arr2.length)
        {
            res= absoluteDiff(arr1[i],arr2[j]);
            if(res < diff)
            {
                diff = res;
            }

            if(arr1[i] < arr2[j])
            {
                i++;
            }
            else //arr1[i] > arr2[j]
            {
                j++;
            }
        }
       
        return diff;

    }
}

-------------------------------

Optimized by sorting the array :

import java.util.*;
public class Solution {

    
    public static int absoluteDiff(int first,int second)
    {
        int sub = first - second;
        if(sub < 0)
        {
            sub = -sub;
        }
        return sub;
    }

    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int diff = Integer.MAX_VALUE;
        int res;
        for(int i=0;i<arr1.length;i++)
        {
            int p = Integer.MAX_VALUE;
            for(int j=0;j<arr2.length;j++)
            {
                res= absoluteDiff(arr1[i],arr2[j]);
                if(res < diff)
                {
                    diff = res;
                }
                if(res <= p)
                {
                    p = res;
                }
                else if(res > p)
                {
                    break;
                }
            }
        }
        return diff;

    }
}



---------------------------------


public class Solution {

    
    public static int absoluteDiff(int first,int second)
    {
        int sub = first - second;
        if(sub < 0)
        {
            sub = -sub;
        }
        return sub;
    }

    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
        // Write your code here.

        int diff = Integer.MAX_VALUE;
        int res;
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                res= absoluteDiff(arr1[i],arr2[j]);
                if(res < diff)
                {
                    diff = res;
                }
            }
        }
        return diff;

    }
}