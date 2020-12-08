package unit_5_Classes;

import java.util.Scanner;

public class FxsPractice
{

	public static String reverse(String s)
	{
		String copy = "";
		for (int i = s.length() - 1; i >= 0; i--)
		{
			copy += s.charAt(i);
		}
		return copy;
	}
	
	private static String between_c_o(String s, char c, char d)
	{
		String newOne = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= c && s.charAt(i) <= d)
			{
				newOne += s.charAt(i);
			}
		}
		return newOne;
	}
	
	public static void main(String[] args)
	{
		/*
		 * Ask user for a string input String is passed to a fx named reverse fx will
		 * traverse the whole string return the string in reverse order print the
		 * reversed string
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string to print backwards: ");
		String inputString = scan.nextLine();
		String finalStr = FxsPractice.reverse(inputString);
		System.out.println(finalStr);
		
		/*
		 * Ask user for a string Make a function call that passes the string and will
		 * return only letters between c and o, and then you will print the new string
		 * "oscar" --> oc
		 */
		System.out.println("Enter a string: ");
		String myString = scan.nextLine();
		String returnedString = FxsPractice.between_c_o(myString, 'c', 'o');
		System.out.println(returnedString);
		scan.close();
	}
	
}
