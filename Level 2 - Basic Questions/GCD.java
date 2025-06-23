Problem statement
You are given two numbers, 'X' and 'Y'. Your task is to find the greatest common divisor of the given two numbers.

The Greatest Common Divisor of any two integers is the largest number that divides both integers.

For Example:
You are given 'X' as 20 and 'Y' as 15. The greatest common divisor, which divides both 15 and 20, is 5. Hence the answer is 5.


-----------------
Hint : According to Euclid's Algorithm : 
Euclid's Algorithm finds the GCD of two numbers using the principle that:

gcd(a, b) = gcd(b, a % b)

This means you keep dividing the larger number by the smaller one and replace the larger number with the remainder. 
When the remainder becomes 0, the other number is the GCD.

e.g. 98 and 56
Biggest number is 98, Smallest number is 56 
Divide 98/56, remainder : 42

Now replace bigger number 98 by 42, 
Now in next iteration, bigger number is 56 and smallest numner is 42

Now 56/42, remainder is 14,

Now in next iteration, bigger number is 42 and smallest number is 14

Now 42/14 gives remainder 0 i.e. GCD of those number is 14.

-----------------------
Code : 

  public static int gcd(int num1,int num2)
   {
	   if(num1>num2)
	   {
		   if(num1%num2 == 0)
		   {
			   return num2;
		   }
		  return gcd(num1%num2,num2);
	   }
	   else
	   {
		   if(num2%num1 == 0)
		   {
			   return num1;
		   }
		   return gcd(num1,num2%num1);
	   }
   }

----------------------

Optimise : 

public static int gcd(int num1, int num2) {
    if (num2 == 0) {
        return num1;  // Base case: when one of the numbers becomes zero, return the other number
    } else {
        return gcd(num2, num1 % num2);  // Recursive call with the remainder
    }
}
