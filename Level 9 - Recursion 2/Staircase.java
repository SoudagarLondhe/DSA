Problem statement
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13



--------------------------------



public class Solution {
	
		
     public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */

	 if(n==1)
	 {
		 return 1;
	 }
	 if(n==2)
	 {
		 return 2;
	 }
	 if(n==3)
	 {
		 return 4;
	 }
	int first = staircase(n-1);
	int second = staircase(n-2);
	int third = staircase(n-3);
	return first+second+third;

	}
	
}