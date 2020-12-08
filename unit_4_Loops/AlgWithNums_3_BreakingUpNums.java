package unit_4_Loops;

import java.util.Scanner;

public class AlgWithNums_3_BreakingUpNums
{
	
	public static void main(String[] args)
	{
		//6765 
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int countOdd = 0;
		
		while(num > 0)
		{
			int digit = num % 10;
			if(digit % 2 == 1)
			{
				countOdd++;
			}
			System.out.println(digit);
			num /= 10;
		}//End while loop
		
		System.out.println("countOdd: " + countOdd);
		
		
		
		
		
		
		scan.close();
	}
	
}
