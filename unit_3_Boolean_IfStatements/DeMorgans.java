package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class DeMorgans
{
	
	public static void main(String[] args)
	{
		int x = 1;
		int y = 1;
		
		//Equality
		boolean result = !((x == 1) && (y == 1));
		System.out.println("Result : " + result);
		
		//DeMorgan's law
		boolean altResult = (x != 1) || (y != 1);
		System.out.println("Result : " + altResult);
		
		
		//Numbers less than 100
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num1 = scan.nextInt();
		
		boolean lessThan100 = num1 < 100;
		System.out.println("Num1 less than 100? " + lessThan100);
		
		//Using DeMorgan's
		boolean aNumber = !(num1 >= 100);
		System.out.println("Num1 less than 100? " + aNumber);
		
		
		scan.close();
	}
	
}
