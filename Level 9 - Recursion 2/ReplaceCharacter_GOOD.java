Problem statement
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.

Do this recursively.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of String S <= 10^6

Sample Input :
abacd
a x
Sample Output :
xbxcd



------------------------------------

public class Solution {

    public static void replaceIt(String str, int i, char c1, char c2, StringBuilder sb) {
        if (i == str.length()) 
        {
            return;
        }

        if (str.charAt(i) == c1) 
        {
            sb.append(c2);
        } 
        else 
        {
            sb.append(str.charAt(i));
        }

        replaceIt(str, i + 1, c1, c2, sb);  // continue recursion
    }

    public static String replaceCharacter(String input, char c1, char c2) {
        StringBuilder sb = new StringBuilder();
        replaceIt(input, 0, c1, c2, sb);
        return sb.toString();
    }
}


-----------------------------------


public class Solution {

	public static StringBuilder replaceIt(String str,int i,char c1,char c2)
	{
		StringBuilder sb = new StringBuilder();
		if(i == str.length())
		{
			return sb;
		}
		if(str.charAt(i) == c1)
		{
			sb.append(c2);
			sb.append( replaceIt(str,i+1,c1,c2) );
		}
		else
		{
			sb.append(str.charAt(i));
			sb.append( replaceIt(str,i+1,c1,c2) );
		}
		return sb;
	}
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

		 StringBuilder sb = new StringBuilder();
		 sb = replaceIt(input,0,c1,c2);
		 return sb.toString();

	}
}
