//	Valerie Dawson
//	vad2127	
/** 	This program takes hardcoded (5, 6 and 1) values and tells whether they are prime or not.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Prime
{
        public static void main(String[] args)
	// main method takes hardcoded variable, calls the static method from below, prints result for each value
        {
                int a = 5;
        	boolean b = primeChecker(a);
		System.out.println(a + " is a prime number: " + b);

		int c = 6;
		boolean d = primeChecker(c);
		System.out.println(c + " is a prime number: " + d);

		int e = 1;
                boolean f = primeChecker(e);
                System.out.println(e + " is a prime number: " + f);
	}

        public static boolean primeChecker(int n)

	// takes in int from main method and decides if it is prime or not
	//uses algorithm given on assignment
        {
		boolean p = true;
		if (n > 1)
		{
			for (int i = 2; i < Math.sqrt(n); i++)
			{
				if (n % i == 0)
				{
					p = false;
				}
			}
		}

		// if the integer is 1 or below it is not a prime
		else
		{
			p = false;
		}
		return p;

	}      
         
}


