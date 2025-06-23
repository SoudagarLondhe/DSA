Problem statement
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.

 Note:
Unique element is always present in the array/list according to the given condition.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
Time Limit: 1 sec
Sample Input 1:
1
7
2 3 1 6 3 6 2
Sample Output 1:
1
Explanation: The array is [2, 3, 1, 6, 3, 6, 2]. Here, the numbers 2, 3, and 6 are present twice, and the number 1 is present only once. So, the unique number in this array is 1.
Sample Input 2:
2
5
2 4 7 2 7
9
1 3 1 3 6 6 7 10 7
Sample Output 2:
4
Explanation: In the first test case, the array is [2, 4, 7, 2, 7]. Here, the numbers 2 and 7 are present twice, and the number 4 is present only once. So, the unique number in this array is 4.

10
Explanation: In the second test case, the array is [1, 3, 1, 3, 6, 6, 7, 10, 7]. Here, the numbers 1, 3, 6, and 7 are present twice, and the number 10 is present only once. So, the unique number in this array is 10.


---------------------------------
Optimised and Good solution : 
As we know for XOR operation, 
a ^ a = 0
0 ^ a = a 

So when we do XOR of all elements all numbers with repition will become zero and 0^a = a i.e unique number 

public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here

        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            res=res^arr[i];
        }
        return res;
    }
}

---------------------------------


import java.util.*;
public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        Map<Integer,Integer> mp = new HashMap<>();
        int val;
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                val = mp.get(arr[i]);
                val=val+1;
                mp.put(arr[i],val);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}