package unit_4_Loops;

import java.util.Scanner;

public class AlgWithNums_1
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//flag
		int flag = 0;
		
		System.out.println("Enter a: ");
		int a = scan.nextInt();
		
		System.out.println("Enter b: ");
		int b = scan.nextInt();
		
		if(b % a == 0)
		{
			System.out.println("a divides b evenly");
		}
		
		if(b == a)
		{
			flag = 1;
		}
		
		if(flag == 1)
		{
			System.out.println("a is equal to b.");
		}
		
		
		System.out.println("\n\n---------------------- while loop and flag-------------------------");
		
		//flag = greater
		boolean greater = (b >= a);
		while(greater)
		{
			System.out.println("b >= a");
			System.out.println("Enter a: ");
			a = scan.nextInt();
			System.out.println("Enter b: ");
			b = scan.nextInt();
			if(b < a)
			{
				greater = false;
			}
		}//End of while loop
		
		System.out.println("Out of the while loop.");
		
		scan.close();
	}
	
}
