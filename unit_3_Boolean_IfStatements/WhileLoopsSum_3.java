package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class WhileLoopsSum_3
{
	/*
	 * Get the sum and the average of all numbers
	 */
	public static void main(String[] args)
	{
		//scanner
		Scanner scan = new Scanner(System.in);
		
		//variables
		int x = 0;
		int counter = 0;
		int sum = 0;
		double average = 0.0;
		
		//loop
		while (x > -1)//Try ((!x <= -1))
		{
			System.out.println("Enter a digit!");
			x = scan.nextInt();
			System.out.println("You entered: " + x + "\n");
			counter ++;
			sum += x;
		}
		
		// After loop is done
		counter--;
		sum -= x;
		System.out.println("You entered " + counter + " numbers.");
		System.out.println("The total sum is: " + sum);
		
		
		average = (double)sum/counter;
		System.out.printf("The average is: %.2f", average);
		
		// close scanner
		scan.close();
	}//End of main
	
}
