Input : 
abc def ghi

Output : 
cba fed ihg



Problem statement
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to change the sentence such that each word in the sentence is reversed. A word is a combination of characters without any spaces.

Example:
Input Sentence: "Hello I am Aadil"
The expected output will look, "olleH I ma lidaA".
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

All the words in string are separated by a single space.

String does not contain any leading or trailing spaces.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc

------------------------


public class Solution {

	public static String reverseIt(StringBuilder sb)
	{
		int i=0,j=sb.length()-1;
		char temp;
		while(i<j)
		{
			temp = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j,temp);

			i++;
			j--;
		}
		return sb.toString();	
	}

	public static String reverseEachWord(String str) {
		//Your code goes here
		StringBuilder sb = new StringBuilder("");
		StringBuilder result=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == ' ')
			{
				result.append(reverseIt(sb));
				result.append(" ");
				sb.setLength(0);
			}
            else{
			sb.append(str.charAt(i));
            }
		}
		result.append(reverseIt(sb));
		return result.toString();
	}

}

--------------------------

class Main {
    public static StringBuffer reverseIt(StringBuffer sb)
    {
        int i=0;
        int j=sb.length()-1;
        char temp;
        while(i<j)
        {
            temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str = "abc def ghi";
        StringBuffer sb = new StringBuffer("");
        String result="";
        char ch;
        for(int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(ch == ' ')
            {
                result = result+" "+reverseIt(sb);
                sb.setLength(0);
                // OR sb=new StringBuffer("");
            }
            else
            {
                sb.append(str.charAt(i));
            }
        }
        result = result+" "+reverseIt(sb);
        System.out.println(result);
    }
}