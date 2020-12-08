package unit_4_Loops;

import java.util.Scanner;

public class TraversingAString_1
{
	
	public static void main(String[] args)
	{
		/*
		 * Add a while loop so that the program continues to ask the user
		 * for more input (words) until (Y/N) question is answered with N.
		 */
		System.out.println("\n\n------ Counting letters--------");
		Scanner scan = new Scanner(System.in);
		
		//Repeating program loop
		boolean continueAsking = true;
		
		while(continueAsking)
		{		
			//User input
			System.out.println("Enter a string to search through: ");
			String word = scan.nextLine();
			System.out.println("What letter are you looking for? ");
			String mysteryLetter = scan.nextLine();
			
			//Start counter and loop
			int count = 0;
			for(int i = 0; i < word.length(); i++)//HELLO
			{
				if(word.substring(i, i + 1).equals(mysteryLetter))
				{
					count++;
				}
			}//End of for loop
			
			System.out.println("There is/are " + count + " instance(s) of the letter" + " " + mysteryLetter);
			
			//Continue with loop?
			System.out.println("\n\nDo you wish to continue? (Y/N)");
			String answer = scan.nextLine();
			answer = answer.toUpperCase();
			if(answer.equals("N"))
			{
				continueAsking = false;
			}
			
			
		}//End of while loop
		
		System.out.println("Thank you for using my program!");
		
		scan.close();
		
		
		
		
	}//End of main
	
}//End of class
