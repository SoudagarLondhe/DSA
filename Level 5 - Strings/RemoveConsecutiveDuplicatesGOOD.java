Problem statement
For a given string(str), remove all the consecutive duplicate characters.

Example:
Input String: "aaaa"
Expected Output: "a"

Input String: "aabbbcc"
Expected Output: "abc"
 Input Format:
The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
Output Format:
The only line of output prints the updated string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
aabccbaa
Sample Output 1:
abcba
Sample Input 2:
xxyyzxx
Sample Output 2:
xyzx


-----------------------------------

Use a StringBuilder instead of a regular string for result. This avoids repeated object creation and improves performance.


public class Solution {

    public static String removeConsecutiveDuplicates(String str) {
        if (str.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = str.charAt(0);
        result.append(currentChar);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != currentChar) {
                result.append(str.charAt(i));
                currentChar = str.charAt(i);
            }
        }

        return result.toString();
    }
}



------------------------------------

In following code :
result = result + str.charAt(i);
This causes new string objects to be created on each concatenation, which is very inefficient in Java — especially with large strings.



public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		if(str.length()==0)
		{
			return "";
		}
		String result = "";
		char currentchar = str.charAt(0);
		result = result + currentchar;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i) != currentchar)
			{
				result=result+str.charAt(i);
				currentchar = str.charAt(i);
			}
		}
		return result;
	}

}