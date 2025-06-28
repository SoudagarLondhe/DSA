Problem statement
For a given a string(str), find and return the highest occurring character.

Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.

Consider:
Assume all the characters in the given string to be in lowercase always.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x



------------------------------



public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
		int arr[] = new int[26];
		int val;
		for(int i=0;i<str.length();i++)
		{
			val = (int)(str.charAt(i) - 'a');
			arr[val]++;
		}
		int maxi = Integer.MIN_VALUE;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > maxi)
			{
				index = i;
				maxi=arr[i];
			}
		}

		return (char)(index+'a');

	}

}