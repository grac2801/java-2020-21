package exceptions;

import java.util.Scanner;

public class InputMismatchExceptionDemo
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		do 
		{
			try
			{
				System.out.println("Enter an integer: ");
				int number = input.nextInt();
				
				//Display the results
				System.out.println("the number entered is " + number);
				
				continueInput = false;
			}
			catch (Exception e)
			{
				System.out.println("Try again. Incorrect input value");
				input.nextLine();
			}
		}
		while(continueInput);
		
		
	
		input.close();
	}//End of main
}//End of class
