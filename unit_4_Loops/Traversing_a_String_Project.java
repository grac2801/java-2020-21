package unit_4_Loops;
import java.util.Scanner;
public class Traversing_a_String_Project
{
	//Traversing a string
	public static void main(String[] args)
	{
		/*
		 * For password symbols, user can only use : 
		 * [unicode values provided]
		 * Exclamation mark 33
		 * Quotation mark = 34
		 * Number sign = 35
		 * Dollar sign = 36
		 * Percent sign = 37
		 * Ampersand = 38
		 * Apostrophe = 39
		 * 
		 */
	
		boolean hasANumber = false;
		boolean hasACapital = false;
		boolean hasLowerCase = false;
		boolean hasSpecialSymbol = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your password: (12 characters)");
		String word = input.nextLine();

		while(!(word.length() == 12))
		{
			System.out.println("Your password needs exactly 12 characters.");
			System.out.println("Enter your password: (12 characters)");
			word = input.nextLine();
		}
		
	
		for(int i = 0; i < word.length(); i++)
		{
//			System.out.printf("%s \n", word.substring(i, i + 1));
			
			//Is it a number?
			char symbol = word.charAt(i);
			if((symbol >= 48) && (symbol <= 57))
			{
				hasANumber = true;
			}
			
			//Is it a capital letter?
			if((symbol >= 65) && (symbol <= 90))
			{
				hasACapital = true;
			}
			
			
			//Is it a lowercase letter
			if((symbol >= 97) && (symbol <= 122))
			{
				hasLowerCase = true;
			}
			
			
			//Is it an allowed symbol
			if((symbol >= 33) && (symbol <=39))
			{
				hasSpecialSymbol = true;
			}
			
			
		}//End of for loop
		/*
		 * Is it a good password?
		 */
		if((hasANumber == true) && (hasACapital == true)
				&& (hasLowerCase == true) && (hasSpecialSymbol == true))
		{
			System.out.println("Good password!");
		}
		else
		{
			if(hasANumber == false)
			{
				System.out.println("You are missing a number!");
			}
			if(hasACapital == false)
			{
				System.out.println("You are missing a CAPITAL letter");
			}
			if(hasLowerCase == false)
			{
				System.out.println("You are missing lowercase letters");
			}
			if(hasSpecialSymbol == false)
			{
				System.out.println("You forgot a special symbol");
			}
		}
		
		
		input.close();
		//Messages to user
		
	}//End of main
	
}//End of class
