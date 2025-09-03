Problem statement
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to return the list of all possible codes that can be generated from the given string.

Note : The order of codes are not important. And input string does not contain 0s.
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= Length of String S <= 10

Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw



---------------------------------------------------
// can be more simplified using List<> or any collection

public class solution {

	public static char convertToChar(String toconvert)
	{
		char result = (char) ('a' + Integer.parseInt(toconvert) - 1);
		return result;
	}
	public static boolean isValid(String str)
	{
		int x = Integer.parseInt(str);
        if(x >=1 && x<=26)
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	public static String[][] findAll(String input, int currentIndex)
	{
		if(currentIndex == input.length()-1)
		{
			String[][] resArray = new String[1][];
			resArray[0] = new String[1];
			resArray[0][0] = String.valueOf(input.charAt(currentIndex));
				// System.out.println("Checking 1st-"+ resArray[0][0]);
			return resArray;
		}
		String[][] returnStringArray = findAll(input,currentIndex+1);
		int newLength = (returnStringArray.length) * 2;
		String[][] newStringArray = new String[newLength][];


		for(int i=0;i<returnStringArray.length;i++)
		{
			int newEachLength = returnStringArray[i].length+1;
			newStringArray[i] = new String[newEachLength];
			newStringArray[i][0] = String.valueOf(input.charAt(currentIndex));
	
			for(int j=0;j<returnStringArray[i].length;j++)
			{
				newStringArray[i][j+1]=returnStringArray[i][j];
			}
		}

		// System.out.println("Checking-"+ newStringArray[0][0]+" "+newStringArray[0][1]);

		for(int i=0,j=newStringArray.length/2;i<returnStringArray.length;i++,j++)
		{
			String firstUpdated = String.valueOf(input.charAt(currentIndex)) + returnStringArray[i][0];
			if(isValid(firstUpdated))
			{
				newStringArray[j]=new String[returnStringArray[i].length];
				newStringArray[j][0]=firstUpdated;
				for(int k=1;k<returnStringArray[i].length;k++)
				{
					newStringArray[j][k]=returnStringArray[i][k];
				}
			}

		}

		// Want to skip the null the 1D rows 
		int count=0;
		for(int i=0;i<newStringArray.length;i++)
		{
			if(newStringArray[i] == null)
			{
				break;
			}
			count++;
		}

		String[][] updatedNewStringArray = new String[count][];

		for(int i=0;i<updatedNewStringArray.length;i++)
		{
			updatedNewStringArray[i] = new String[newStringArray[i].length];
			for(int j=0;j<updatedNewStringArray[i].length;j++)
			{
				updatedNewStringArray[i][j]=newStringArray[i][j];
			}
		}

		// System.out.println("New Updated 2D Strings");
		// for(int i=0;i<updatedNewStringArray.length;i++)
		// {
		// 	for(int j=0;j<updatedNewStringArray[i].length;j++)
		// 	{
		// 		System.out.print(updatedNewStringArray[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }
		// System.out.println("New Updated 2D Strings end");


		return updatedNewStringArray;
	}
	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
		String[][] newStringArray = findAll(input,0);
		String[] result = new String[newStringArray.length];
		int index=0;
		
		// System.out.println("Convert that number to alphabet");
		for(int i=0;i<newStringArray.length;i++)
		{
			StringBuilder sb=new StringBuilder("");
			for(int j=0;j<newStringArray[i].length;j++)
			{
				newStringArray[i][j] = String.valueOf(convertToChar(newStringArray[i][j]));
			    // System.out.print(newStringArray[i][j]+" ");
				sb.append(newStringArray[i][j]);
			}
			result[index]=sb.toString();
			index++;
			// System.out.println();
		}

		return result;
		
	}

}
