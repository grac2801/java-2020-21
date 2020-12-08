package unit_4_Loops;

import java.util.Scanner;

public class AlgWithNums_2_Counter
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter a or -1 to stop: ");//sentinel 
		int a = scan.nextInt();
		
		while(a != -1)
		{
			if(a < 10)
			{
				count++;
			}
			System.out.println("Enter a or -1 to stop: ");
			a = scan.nextInt();
			
		}//End of while
		
		if(count == 1)
		{
			System.out.println("You entered " + count + " number < 10.");
		}
		else {
			System.out.println("You entered " + count + " numbers < 10.");
		}
		
		
		
		
		scan.close();
	}
	
}
