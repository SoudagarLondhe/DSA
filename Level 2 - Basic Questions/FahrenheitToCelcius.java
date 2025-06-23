Problem statement
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.



Note: You don't have to write the main function or take input. It has already been taken care of and you need to just print the integer value . Just write the code that prints Fahrenheit to Celsius table in the function itself.
Formula is C = (F - 32) * 5/9
Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= S <= 1000
0 <= E <= 1000
0 <= W <= 1000


------------------


public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {

		 int cl;
		 for(int i=start;i<=end;i=i+step)
		 {
			 cl =(int) (( (i-32)*5 ) / 9);
			 System.out.println(i+" "+cl);
		 }
		
	}
}

// make sure first do (F-32) then multiply it by 5, and then whole divide by 9
-------------------------