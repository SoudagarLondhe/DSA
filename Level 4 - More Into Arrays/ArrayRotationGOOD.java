Problem statement
You are given an array A of size N.

You are also given an integer X and a direction DIR. You need to rotate the array A by X positions in the direction specified by DIR.

DIR can be:

'LEFT': Rotate the array to the left by X positions.
'RIGHT': Rotate the array to the right by X positions.
Return the resulting rotated array.

For example:

Input :
A = [6, 2, 6, 1], X = 1, DIR = ‘LEFT’

Output :
2 6 1 6

Explanation: Rotate array ‘A’ to the left one time.
[6, 2, 6, 1] => [2, 6, 1, 6]
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= T <= 10
1 <= N <= 10^5 
1 <= X <= 10^9
‘DIR’ is an element of {‘LEFT’, ‘RIGHT’}
Time Limit: 1 sec
Sample Input 1 :
2
4 1 LEFT
1 2 3 4
6 2 RIGHT
1 2 4 3 5 6 
Sample Output 1 :
2 3 4 1
5 6 1 2 4 3
Explanation Of Sample Input 1 :
For test case one:

Input :
A = [1, 2, 3, 4], X = 1, DIR = ‘LEFT’

Output :
2 3 4 1

Explanation: Rotate array ‘A’ to the left one time.
[1, 2, 3, 4] => [2, 3, 4, 1]

For test case two:

Input :
A = [1, 2, 4, 3, 5, 6], X = 2, DIR = ‘RIGHT’

Output :
5 6 1 2 4 3

Explanation: Rotate array ‘A’ to the right one time.
[1, 2, 4, 3, 5, 6] => [6, 1, 2, 4, 3, 5]
Sample Input 2 :
2
6 3 LEFT
22 8 4 7 5 10
6 2 RIGHT
9 3 1 6 3 9
Sample Output 2 :
7 5 10 22 8 4 
3 9 9 3 1 6 





Both the solutions are good : 
-------------------------------


public class Solution {
    public static void reverse(int[] arr,int startIndex,int lastIndex)
    {
        int temp;
        while(startIndex < lastIndex)
        {
            //swap s,l
            temp = arr[startIndex];
            arr[startIndex]=arr[lastIndex];
            arr[lastIndex]=temp;
            startIndex++;
            lastIndex--;
        }
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        int n =a.length;
        x=x%n;
        if(dir.equals("LEFT"))
        {
            reverse(a, 0,n-1);
            reverse(a,0,n-x-1);
            reverse(a,n-x,n-1);
        }
        if(dir.equals("RIGHT"))
        {
            reverse(a,0,n-1);
            reverse(a,0,x-1);
            reverse(a,x,n-1);
        }
        return a;
    }
}




------------------------------

public class Solution {
    public static void reverse(int[] arr, int startIndex, int lastIndex) {
        int temp;
        while (startIndex < lastIndex) {
            temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }
    }

    public static int[] rotateArray(int[] a, int x, String dir) {
        int n = a.length;
        x = x % n; // avoid unnecessary rotations

        if (dir.equals("LEFT")) {
            reverse(a, 0, x - 1);
            reverse(a, x, n - 1);
            reverse(a, 0, n - 1);
        } else if (dir.equals("RIGHT")) {
            reverse(a, 0, n - 1);
            reverse(a, 0, x - 1);
            reverse(a, x, n - 1);
        }

        return a;
    }
}
