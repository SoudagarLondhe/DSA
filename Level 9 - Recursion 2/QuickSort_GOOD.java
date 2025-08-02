Problem statement
Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.



Note :
Make changes in the input array itself.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 2 3 5 7
Sample Output 2 :
1 2 3 5 7 
Constraints :
1 <= N <= 10^3
0 <= input[i] <= 10^9




--------------------------------------------


public class Solution {

    public static int partition(int[] arr, int i, int j) {
        int pivotIndex =  i;
        int pivotValue = arr[pivotIndex];

        while (i < j) {
            // Move i to the right until we find an element > pivot
            while (i <= j && arr[i] <= pivotValue) {
                i++;
            }
            // Move j to the left until we find an element > pivot
            while (i <= j && arr[j] > pivotValue) {
                j--;
            }

            // Swap if out of place
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct sorted position
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int pivot = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, pivot - 1);
        quickSort(input, pivot + 1, endIndex);
    }
}


Main =>

 public static void main(String[] args) {
        int[] input = takeInput();
        Solution.quickSort(input, 0, input.length - 1);
 }