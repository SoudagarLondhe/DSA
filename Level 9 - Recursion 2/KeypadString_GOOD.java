Problem statement
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.

Return empty string for numbers 0 and 1.

Note :
1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= n <= 10^6

Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf



-------------------------------------------------------



public class solution {

	public static String findString(int num)
	{
		switch(num)
		{
			case 2 : return "abc";
			case 3 : return "def";
			case 4 : return "ghi";
			case 5 : return "jkl";
			case 6 : return "mno";
			case 7 : return "pqrs";
			case 8 : return "tuv";
			case 9 : return "wxyz";
		}
		return "";
	}
	public static String[] countIt(int n)
	{
		if(n/10 == 0)
		{
			String currentNumString = findString(n);
			String[] initialArray = new String[currentNumString.length()];
			for(int i=0;i<initialArray.length;i++)
			{
				initialArray[i]=String.valueOf(currentNumString.charAt(i));
			}
			return initialArray;
		}
		String[] str = countIt(n/10);
		// System.out.println("currentNumber: "+n%10);
		int currentNum = n%10;
		String currentNumString = findString(currentNum);
		// System.out.println(currentNum+" "+ currentNumString);
		// System.out.println("Previous result array- ");
		// for(int i=0;i<str.length;i++)
		// {
		// 	System.out.println(str[i]);
		// }
		String[] newRes = new String[str.length*currentNumString.length()];
		// System.out.println("New Length-"+newRes.length);
		for(int i=0,j=0;i<newRes.length;i++)
		{
			newRes[i]=str[j];
			j++;
			if(j==str.length)
			{
				j=0;
			}
		
		}
		int count=0;
		for(int i=0,j=0;i<newRes.length;i++)
		{
			newRes[i]=newRes[i]+String.valueOf(currentNumString.charAt(j));
			count++;
			if(count == str.length)
			{
				j++;
				count=0;
			}
		}



		return newRes;
	}
	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here

			String[] str;
			str= countIt(n);
			return str;

	}
	
}
