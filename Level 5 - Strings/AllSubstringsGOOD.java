Problem statement
For a given input string(str), write a function to print all the possible substrings.

Substring
A substring is a contiguous sequence of characters within a string. 
Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abc
Sample Output 1:
a 
ab 
abc 
b 
bc 
c 
 Sample Input 2:
co
Sample Output 2:
c 
co 
o

-------------------------------
Another solution : 
// Here we will print first all single combinations, then all two combinations and 
// then all three combinations,... and so on 

public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length()-i;j++)
			{
				System.out.println(str.substring(j,j+i+1));
			}
		}
	}

}


--------------------------------



public class Solution {

	public static void printSubstrings(String str) {
		//Your code goes here
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				// System.out.println(i+ " "+ j);
				System.out.println(str.substring(i,j));
			}
		}
	}

}


For N length there will be N(N+1)/2  Substrings can be formed  

