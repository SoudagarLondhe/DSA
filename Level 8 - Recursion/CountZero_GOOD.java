Problem statement
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
0 <= N <= 10^9
Sample Input 1 :
0
Sample Output 1 :
1
Sample Input 2 :
00010204
Sample Output 2 :
2
Explanation for Sample Output 2 :
Even though "00010204" has 5 zeros, the output would still be 2 because when you convert it to an integer, it becomes 10204.
Sample Input 3 :
708000
Sample Output 3 :
4


-------------------------------------


public class solution {

    public static int check(int input)
    {
        if(input == 0)
        {
            return 0;
        }

        if(input%10 == 0)
        {
            return 1+check(input/10);
        }
        else
        {
            return check(input/10);
        }
    }
	public static int countZerosRec(int input){
        if(input == 0)
        {
            return 1;
        }
        return  check(input);
	}
}
