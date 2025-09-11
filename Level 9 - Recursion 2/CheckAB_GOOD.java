Suppose you have a string, S, made up of only 'a's and 'b's. Write a recursive function that checks if the string was generated using the following rules:

a. The string begins with an 'a'
b. Each 'a' is followed by nothing or an 'a' or "bb"
c. Each "bb" is followed by nothing or an 'a'
If all the rules are followed by the given string, return true otherwise return false.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
abb
Sample Output 1 :
true
Sample Input 2 :
abababa
Sample Output 2 :
false
Explanation for Sample Input 2
In the above example, a is not followed by either "a" or "bb", instead it's followed by "b" which results in false to be returned.



--------------------------------------------------------


public class Solution {

	public static boolean checkIt(String input,int index)
	{
		if(index == 0)
		{
			if(input.charAt(0) == 'a')
			{
				return true;
			}
			return false;
		}
		boolean previousResult = checkIt(input,index-1);
		if(!previousResult)
		{
			return false;
		}

		if(input.charAt(index-1) == 'a')
		{
			if(input.charAt(index) == 'a' || input.charAt(index) == 'z' || index == input.length() )
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		else if(input.charAt(index-1) == 'z')
		{
			if(input.charAt(index) == 'a' || index == input.length() )
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		return false;
	}
	public static String replaceIt(String str)
	{
		StringBuilder sb = new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'b' && ( (i+1 <= str.length()-1 ) && str.charAt(i+1) == 'b') )
			{
				sb.append("z");
				i++;
			}
			else 
			{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	public static boolean checkAB(String input) {
		// Write your code here
		String str = replaceIt(input);
		return checkIt(str,str.length()-1);

	}
}
