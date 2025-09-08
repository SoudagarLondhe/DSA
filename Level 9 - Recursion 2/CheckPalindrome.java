Problem statement
Determine if a given string ‘S’ is a palindrome using recursion. Return a Boolean value of true if it is a palindrome and false if it is not.

Note: You are not required to print anything, just implement the function. Example:
Input: s = "racecar"
Output: true
Explanation: "racecar" is a palindrome.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
abbba
Sample Output 1:
true
Explanation Of Sample Input 1 :
“abbba” is a palindrome
Sample Input 2:
abcd
Sample Output 2:
false
Explanation Of Sample Input 2 :
“abcd” is not a palindrome.
Constraints:
0 <= |S| <= 10^6
where |S| represents the length of string S.









------------------------------------------------------


public class Solution {

    public static boolean find(String str, int start,int end)
    {
        if(start >= end)
        {
            return true;
        }
        if(str.charAt(start) != str.charAt(end))
        {
            return false;
        }
       return find(str, start+1, end-1);
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
       return find(str,0,str.length()-1);
    }
}
