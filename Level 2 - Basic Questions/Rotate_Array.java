// Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

// Note: Consider the array as circular.

// Examples :

// Input: arr[] = [1, 2, 3, 4, 5], d = 2
// Output: [3, 4, 5, 1, 2]
// Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.
// Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
// Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
// Explanation: when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
// Input: arr[] = [7, 3, 9, 1], d = 9
// Output: [3, 9, 1, 7]
// Explanation: when we rotate 9 times, we'll get 3 9 1 7 as resultant array.
// Constraints:
// 1 <= arr.size(), d <= 105
// 0 <= arr[i] <= 105



class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) 
    {
        // add your code here
       int ns = d%arr.length;
       
       reverse_arr(arr,0,arr.length-1);
       reverse_arr(arr,0,arr.length-ns-1);
       reverse_arr(arr,arr.length-ns,arr.length-1);
       
       
    }
    static void reverse_arr(int arr[],int i,int j)
    {
        // int j=arr.length-1;
        int temp;
        for(;i<j;i++,j--)
        {
            //swap
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}