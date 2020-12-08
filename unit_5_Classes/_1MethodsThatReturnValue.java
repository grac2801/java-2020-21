package unit_5_Classes;

import java.util.Scanner;

public class _1MethodsThatReturnValue
{
	public static int max(int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		return b;
	}// end of max method
	
	/**
	 * [ACTIVITY FROM VIDEO 3]
	 * 
	 * @param args
	 */
	public static double average(double a, double b)
	{
		
		double average = (a + b) / 2;
		return average;
	}
	
	public static boolean hasDuplicates(String word)
	{
		for (int i = 0; i < word.length(); i++)
		{
			for (int j = i + 1; j < word.length(); j++)
			{
				if (word.substring(i, i + 1).equals(word.substring(j, j + 1)))
				{
					return true;
				}
			}
		}
		return false; // has duplicates
	}// End of method
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = scan.nextInt();
		System.out.println("Enter y: ");
		int y = scan.nextInt();
		System.out.println("The largest number is: " + max(x, y));
		// It returns number if both are equal
		
		/*
		 * [VIDEO 2] You can use the return in a variable
		 */
		int largest = max(x, y);
		System.out.println("Largest: " + largest);
		System.out.println("Add 1 to it: " + ++largest);
		
		// Use boolean
		if (max(x, y) > 10)
		{
			System.out.println("It is > 10");
		}
		
		/*
		 * [VIDEO 3] There can be many parameters, but the method can only return one
		 * value Activity: Write a method called average which takes two double
		 * parameters and returns the average.
		 */
		System.out.println("\n\nEnter first double: ");
		double d1 = scan.nextDouble();
		System.out.println("Enter second double: ");
		double d2 = scan.nextDouble();
		double avgAns = _1MethodsThatReturnValue.average(d1, d2);
		System.out.printf("The average is %,.2f", avgAns);
		
		/*
		 * [VIDEO 5] Using iteration Make a method called hasDuplicates(String word)
		 */
		//Last entry was a number so add a scan.next();
		scan.nextLine();
		System.out.println("\n\nEnter a word to check if it has duplicates: ");
		String input = scan.nextLine();
		boolean duplicates = _1MethodsThatReturnValue.hasDuplicates(input);
		System.out.println("The word input has duplicates: " + duplicates);
		
		if(duplicates == true)
		{
			System.out.println("The string " + "\'" + input + "\'" + " has duplicates.");
		}
		else
		{
			System.out.println("The string " + "\'" + input + "\'" + " has not duplicates.");
		}
		
		
		
		/*
		 * [VIDEO 6]Method overloading
		 * public static int add(int a)
		 * public static double add(int z) //Not allowed
		 * 
		 * public static int add(int a, int b)
		 * public static double add(int z, double b) //allowed
		 * 
		 * ------------------------------------------------
		 * 
		 *  [VIDEO 6]Method decomposition
		 *  
		 */
		
		scan.close();
	}
}
