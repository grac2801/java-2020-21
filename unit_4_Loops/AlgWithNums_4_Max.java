package unit_4_Loops;

import java.util.Scanner;

public class AlgWithNums_4_Max
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int num = 0;
		
		while(num != -1)
		{
			System.out.println("Enter # or -1 to stop: ");
			num = scan.nextInt();
			
			if(num > max)
			{
				max = num;
			}
		}//End while loop
		
		System.out.println("The max number is: " + max);
		
		
		
		scan.close();
	}
}
