Problem statement
Create a function that determines whether a given number N belongs to the Fibonacci sequence. If N is found in the Fibonacci sequence, the function should return true; otherwise, it should return false.



Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= n <= 10^4
Sample Input 1 :
5
Sample Output 1 :
true
Explanation :
Fibonacci sequence begins 0, 1, 1, 2, 3, 5, ... and so on. Since 5 appears in the sequence.
Sample Input 2 :
14
Sample Output 2 :
false    


-----------------------------------

public class Solution {
	
	public static boolean checkMember(int n){
				
		if(n==0|| n==1)
		{
			return true;
		}
		int fn=0,sn=1;
		while(fn+sn<=n)
		{
			if(fn+sn == n)
			{
				return true;
			}
			sn=sn+fn;
			fn=sn-fn;
		}
		return false;

	}
	

}