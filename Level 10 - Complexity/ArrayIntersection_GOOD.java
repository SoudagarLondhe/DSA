Problem statement
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.

Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in ascending order.


Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^4
0 <= M <= 10^4

Time Limit: 1 sec 
Sample Input 1 :
2
6
2 6 8 5 4 3
4
2 3 4 7 
2
10 10
1
10
Sample Output 1 :
2 3 4
10
Sample Input 2 :
1
4
2 6 1 2
5
1 2 3 4 2
Sample Output 2 :
1 2 2
Explanation for Sample Output 2 :
Since, both input arrays have two '2's, the intersection of the arrays also have two '2's. The first '2' of first array matches with the first '2' of the second array. Similarly, the second '2' of the first array matches with the second '2' if the second array.


---------------------------------------------------

More optimized would be sorting only one array and using another apply binary search to that array 
which was sorted, in this case also we will get same complexity i.e O(mlogm) + O(nlogn)
But the best part is we will sort that array which is shorter in length, so that we can reduce the logm part, 
so this is more optimised one.  
---------------------------------------------------

Complexity for this : 
O(mlogm) + O(nlogn) +   m +     n 
Sort        Sort     travel    travel 

= O(mlogm) + O(nlogn)

import java.util.*;
public class Solution {

	public static void intersection(int[] arr1, int[] arr2) 
	{
	    //Your code goes here
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i=0,j=0;i<arr1.length && j<arr2.length;)
		{
			if(arr1[i] ==arr2[j])
			{
				System.out.print(arr1[i]+" ");
				i++; j++;
			}
			else if(arr1[i] < arr2[j])
			{
				i++;
			}
			else if(arr1[i] > arr2[j])
			{
				j++;
			}
		}

	}

}