Problem statement
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.

'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.

Note:
You need to change in the given array/list itself. Hence, no need to return or print anything. 
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= t <= 10^2
0 <= N <= 10^1

Time Limit: 1 sec
Sample Input 1:
1
7
0 1 2 0 2 0 1
Sample Output 1:
0 0 0 1 1 2 2 
Sample Input 2:
2
5
2 2 0 1 1
7
0 1 2 0 1 2 0
Sample Output 2:
0 1 1 2 2 
0 0 0 1 1 2 2








-------------------------------------------


public class Solution {
    public static void swapElements(int[] arr,int index1,int index2)
    {
        int temp;
        temp =arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void sort012(int[] arr, int n){
        //Your code goes here

        int f=0,l=n-1;
        for(int i=0;i<arr.length && i<l;)
        {
            if(arr[i]==0)
            {
                //swap arr[i], arr[f]
               swapElements(arr,i,f);
                i++;
                f++;
            }
            else if(arr[i]==1)
            {
                i++;
            }
            else if(arr[i]==2)
            {
                //swap arr[i],arr[l]
                swapElements(arr,i,l);
                l--;
            }

        }
    }
}

----------------------------------------------