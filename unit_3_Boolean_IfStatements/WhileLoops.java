package unit_3_Boolean_IfStatements;

import java.util.Scanner;

class WhileLoops
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int x = 0;
		
		while (x > -1)//Try ((!x <= -1))
		{
		
			System.out.println("Enter a digit!");
			x = scan.nextInt();
			System.out.println("You entered: " + x + "\n");
		}
		
		// After loop is done
		System.out.println("Done");
		
		// close scanner
		scan.close();
	}//End of main
}
