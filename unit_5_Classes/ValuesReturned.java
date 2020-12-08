package unit_5_Classes;

import java.util.Scanner;

public class ValuesReturned
{
	/**
	 * Checks whether there is a duplicate character in the string
	 * @param word
	 * @return boolean
	 */
	public static boolean hasDuplicates(String word)
	{
		for(int i = 0; i < word.length(); i++)
		{
			for(int j = i + 1; j < word.length(); j++)
			{
				if(word.substring(i, i + 1).equals(word.substring(j, j + 1)))
				{
					return true;
				}
			}
		}
		return false;
		
	}
	
	/**
	 * Takes in 2 doubles and returns a double average of both values
	 * @param a
	 * @param b
	 * @return
	 */
	public static double average(double a, double b)
	{
		double averageAns = (a + b) / 2;
		return averageAns;
	}
	
	/**
	 * Takes in 2 parameters. Must be integers
	 * 
	 * @param a
	 * @param b
	 * @return the largest of the integers
	 */
	public static int max(int a, int b)
	{
		if (a > b)
		{
			return a;
		}
		
		return b;
	}
	
	public static void main(String[] args)
	{
		// A call to a method that provides me with the highest number passed.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number x: ");
		int x = scan.nextInt();
		System.out.println("Enter number y: ");
		int y = scan.nextInt();
		int answer = ValuesReturned.max(x, y);
		System.out.println("The largest number is: " + answer);
		
		System.out.println("The largest number is: " + ++answer);
		
		
		System.out.println("Enter first double value: ");
		double d1 = scan. nextDouble();
		System.out.println("Enter second double value: ");
		double d2 = scan. nextDouble();
		double averageAnswer = average(d1, d2);
		System.out.printf("The average is: %,.2f", averageAnswer);
		
		
		String input = "Janury";
		boolean duplicateAns = hasDuplicates(input);
		System.out.println("The word " + input + " has duplicates? " + duplicateAns);
		
		scan.close();
	}
	
}
