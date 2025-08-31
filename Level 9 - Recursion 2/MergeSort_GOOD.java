Problem statement
You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.



You must sort the elements between 'l' and 'r'.



Note:
Change in the input array itself. So no need to return or print anything.
Example:
Input: 'N' = 7,
'ARR' = [2, 13, 4, 1, 3, 6, 28]

Output: [1 2 3 4 6 13 28]
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
7
2 13 4 1 3 6 28
Sample Output 1:
1 2 3 4 6 13 28
Explanation of Sample Output 1:
After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
Sample Input 2:
5
9 3 6 2 0
Sample Output 2:
0 2 3 6 9
Explanation of Sample Output 2:
After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
Constraints :
1 <= N <= 10^3
0 <= ARR[i] <= 10^9
      


-----------------------------------------
Prefered :

//updating the array instead of creating everytime new array

public class Solution {

    public static void mergeArray(int[] arr,int l,int mid,int r)
    {
        int[] arr1 = new int[mid-l+1];
        int[] arr2 = new int[r-mid];
        int i,j,k=l;

        for(i=0,j=l;i<arr1.length;i++,j++)
        {
            arr1[i]=arr[j];
        }

        for(i=0,j=mid+1;i<arr2.length;i++,j++)
        {
            arr2[i]=arr[j];
        }

        i=0;
        j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else 
            {
                arr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i<arr1.length)
        {
                arr[k] = arr1[i];
                k++;
                i++;
        }

        while(j<arr2.length)
        {
                arr[k] = arr2[j];
                k++;
                j++;
        }
    }
    public static void mergeSort(int[] arr, int l, int r)
    {
        // Write your code here
        if(l>=r)
        {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        mergeArray(arr,l,mid,r);

    }
}


main =>
  public static void main(String[] args) {
        int[] input = takeInput();
        Solution.mergeSort(input, 0, input.length - 1);
        printArray(input);
    }


--------------------------------------------

public class Solution {

    public static void mergeArray(int[] arr1,int[] arr2,int[] arr)
    {
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                arr[k] = arr1[i];
                i++;
                k++;
            }
            else 
            {
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i<arr1.length)
        {
              arr[k] = arr1[i];
                i++;
                k++;
        }

        while(j<arr2.length)
        {
                arr[k] = arr2[j];
                j++;
                k++;
        }

    }
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
      
       if(arr.length <=1)
       {
           return;
       }
        int mid = (l+r)/2;
        int[] arr1 = new int[mid-l+1];
        int[] arr2 = new int[arr.length-arr1.length];

        // for(int i=0;i<arr1.length;i++)
        // {
        //     arr1[i]=arr[i];
        // }

        // for(int i=0,j=mid+1;i<arr2.length;i++,j++)
        // {
        //     arr2[i]=arr[j];
        // }

        for(int i=l, j=0;j<arr1.length;i++,j++)
        {
            arr1[j]=arr[i];
        }

        for(int i=mid+1, j=0;j<arr2.length;i++,j++)
        {
            arr2[j]=arr[i];
        }

        mergeSort(arr1,0,arr1.length-1);
        mergeSort(arr2,0,arr2.length-1);
        mergeArray(arr1,arr2,arr);

    }
}

main =>
  public static void main(String[] args) {
        int[] input = takeInput();
        Solution.mergeSort(input, 0, input.length - 1);
        printArray(input);
    }




