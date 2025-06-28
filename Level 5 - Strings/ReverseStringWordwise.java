Problem statement
Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= |S| <= 10^7
where |S| represents the length of string, S.
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
Ninjas Coding to Welcome
Sample Input 2:
Always indent your code
Sample Output 2:
code your indent Always


---------------------------------------
//can be more optimised using split for more spaces handling
---------------------------------------

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
		if (input == null || input.length() == 0) {
            return input;
        }

		String result="";
		int currentStartIndex=0;
		int i;
		for(i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				result=input.substring(currentStartIndex,i+1)+result;
				currentStartIndex = i+1;
			}
		}
		result=input.substring(currentStartIndex,i)+" "+result;
		return result;

	}
}


