Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.
Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.
Input: arr = [3, 4, 2, 5, 1]
Output: [3, 4, 5, 1, 2]
Explanation: The next permutation of the given array is [3, 4, 5, 1, 2].
Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(1)




-------------------------------------------------------
// User function Template for Java

class Solution {
    void nextPermutation(int[] arr) {
        // code here
        
        int temp,index,min,i;
        for(i=arr.length-2;i>=0;i--)
        {
            if(arr[i] < arr[i+1])
            {
                min=Integer.MAX_VALUE;
                // st=arr[i];
                index=-1;
                
              for(int j=i+1;j<arr.length;j++)
                {
                    if((arr[j]-arr[i]) > 0 && (arr[j]-arr[i]) < min )
                    {
                        // st=arr[j];
                        index=j;
                    }
                }
                
                // st is the smallest with index 'index';
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                
                //reverse the rest arrays
                int k=arr.length-1;
                for(int j=i+1;j<k;j++,k--)
                {
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
                break;
                
            }
        }
        
        if(i==-1)
        {
            //reverse the complete array :
            int k=arr.length-1;
            for(int j=0;j<k;j++,k--)
            {
                temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
            }
        }
        
    }
  
}