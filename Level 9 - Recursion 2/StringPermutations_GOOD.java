Problem statement
Given a string S, find and return all the possible permutations of the input string.

Note 1 : The order of permutations is not important. Note 2 : If original string contains duplicate characters, permutations will also be duplicates.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input :
abc
Sample Output :
abc
acb
bac
bca
cab
cba



--------------------------------------------------

public class solution {
	public static int findFact(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		return n*findFact(n-1);
	}
	public static String[] findAll(String input,int currentIndex)
	{
		if(currentIndex == input.length()-1)
		{
			int strlen = findFact(1);
			String[] res = new String[strlen];
			res[0] = String.valueOf(input.charAt(currentIndex));
			return res;
		}
		String[] returnedStringArray = findAll(input,currentIndex+1);
		String[] newString = new String[ findFact(input.substring(currentIndex).length()) ];

		// System.out.println("Returned String => ");
		// for(int i=0;i<returnedStringArray.length;i++)
		// {
		// 	System.out.println(returnedStringArray[i]+" ");
		// }
		// System.out.println("Returned String => ");
		int k=0;
		for(int i=0;i<returnedStringArray.length;i++)
		{
			String eachString = returnedStringArray[i];
			int j=0;
			while(j<=eachString.length())
			{
				StringBuilder sb = new StringBuilder("");

				sb.append(eachString.substring(0,j));
				sb.append(input.charAt(currentIndex));
				sb.append(eachString.substring(j));

				newString[k]=sb.toString();
				k++;
				j++;
			}
		}


		return newString;
	}
	
	public static String[] permutationOfString(String input)
	{
		// Write your code here
		String[] res = findAll(input,0);
		return res;
	}
	
}

