package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class WhileLoopsCounter_2
{
	/*
	 * Create a counter for each number input, and explain the concept of scope
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		
		int counter = 0;
		while (x > -1)//Try ((!x <= -1))
		{
			System.out.println("Enter a digit!");
			x = scan.nextInt();
			System.out.println("You entered: " + x + "\n");
			counter ++;
		}
		
		// After loop is done
		counter--;
		System.out.println("You entered " + counter + " numbers.");
		
		// close scanner
		scan.close();
		
		
		
		
	}//End of main
}
