Problem statement
Given a string S, remove consecutive duplicates from it recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
	

------------------------------------

public class Solution {

	public static void removeIt(String str,int i,StringBuilder sb)
	{
		if(i == str.length())
		{
			return;
		}
		if(str.charAt(i)!=str.charAt(i-1))
		{
			sb.append(str.charAt(i));
		}
		removeIt(str,i+1,sb);
	}

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if(s.length() <= 1)
		{
			return s;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(s.charAt(0));
		removeIt(s,1,sb);
		return sb.toString();

	}

}