Problem statement
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= |S| <= 1000
where |S| represents length of string S.
Sample Input 1 :
hello
Sample Output 1:
hel*lo
Sample Input 2 :
aaaa
Sample Output 2 :
a*a*a*a

------------------------------


public class solution {

	public static StringBuilder convertIt(String s,int currentIndex)
	{
		if(currentIndex == s.length())
		{
			return new StringBuilder("");
		}
		StringBuilder sb = convertIt(s,currentIndex+1);
		// sb.append(s.charAt(currentIndex));
		sb.insert(0,s.charAt(currentIndex));
		if( currentIndex >=1 && s.charAt(currentIndex) == s.charAt(currentIndex-1) )
		{
			sb.insert(0,"*");
			// sb.append("*");
		}
		return sb;
		
	}

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here

		return convertIt(s,0).toString();

	}
}
