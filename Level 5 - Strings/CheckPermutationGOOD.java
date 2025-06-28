Problem statement
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.

Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false



--------------------------------------
More Optimized : 
HashMap<Character, Integer>

--------------------------------------
Optimized : 
If inputs might contain uppercase or symbols, use int[256]

--------------------------------------



public class Solution {

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here

        if (str1.length() != str2.length()) {
            return false;
        }

		int arr[] = new int[26];
		int x;

		for(int i=0;i<str1.length();i++)
		{
			x = (int)(str1.charAt(i) - 'a');
			arr[x]++;
		}

		for(int i=0;i<str2.length();i++)
		{
			x = (int)(str2.charAt(i) - 'a');
			arr[x]--;
		}

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != 0)
			{
				return false;
			}
		}
		return true;
	}
}