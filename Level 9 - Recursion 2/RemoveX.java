Problem statement
Given a string, compute recursively a new string where all 'x' chars have been removed.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:

------------------------------------------



public class solution {

	// Return the changed string

	public static void removeIt(String str,int i,StringBuilder sb)
	{
		if( i==str.length() )
		{
			return;
		}
		if(str.charAt(i) != 'x')
		{
			sb.append(str.charAt(i));
		}
		removeIt(str,i+1,sb);
	}
	public static String removeX(String input){
		// Write your code here
		StringBuilder sb = new StringBuilder();
		removeIt(input,0,sb);
		return sb.toString();
	}
}
