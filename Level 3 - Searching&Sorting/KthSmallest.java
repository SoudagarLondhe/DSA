Problem statement
You have been given an array/list and a number k. You have to find the kth smallest number.

Example:
Input: ‘N’ = 5 , 'k' = 2
‘A’ = [3, 2, 11, 5, 1]

Output: 2

Explanation: For nums = [3, 2, 11, 5, 1],
In the given array, smallest element is 1 and 2nd smallest element is 2 and the value of k is 2. So, our output will be 2.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 10^4
1 <= nums[i] <= 10^9
Time Limit: 1 sec
Sample Input 1:
5
3 2 5 11 1
2
Sample Output 1:
2
Sample Input 2:
7
17 5 14 16 11 18 10
5
Sample Output 2:
16



------------------------------------

public class Solution {
    public static int kthSmallest(int[] arr, int n, int k) {
        int min_index, temp;

        // Perform selection sort up to the k-th smallest element
        for (int i = 0; i < k; i++) {
            min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // Swap the found minimum with arr[i]
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        // After k iterations, the k-th smallest element is at index k-1
        return arr[k - 1];
    }
}



-------------------------------------


public class Solution {
    public static int kthSmallest(int[] arr, int n, int k){
        //Your code goes here

        int min_index,count=0,temp;
        for(int i=0;i<arr.length-1;i++)
        {
            min_index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[min_index])
                {
                    min_index = j;
                }
            }
            count++;
            //swap
            temp = arr[i];
            arr[i]=arr[min_index]; 
            arr[min_index]= temp;
            if(count == k)
            {
                return arr[i];
            }

        }
        return -1;
    }

}