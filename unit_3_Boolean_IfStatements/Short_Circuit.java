package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class Short_Circuit
{
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		System.out.println("\n\n---------------------- Short circuit using &&-------------------------");
		
		if(false && true && true)
		{
			//Dead code, and it will never get printed.
			System.out.println("This output will not be printed");
		}
		else
		{
			System.out.println("This output got printed actually, due to short circuit");
		}
		
		
		//another example using &&
		if(true && true && true)
		{
			System.out.println("This will get printed.");
		}
		else
		{
			System.out.println("This will NOT be printed");
		}
		
		
		
		System.out.println("\n\n---------------------- More on ||-------------------------");
		
		if(false || false || true)
		{
			System.out.println("This output gets printed as there will be no short circuit");
		}
		else
		{
			System.out.println("Dead code");
		}
		
		
		System.out.println("\n\n---------------------- What will happen??-------------------------");
		
		int c = 0, d = 100, e = 50;
		if( c == 1 && e++ < 100)
		{
			d = 150;
		}
		System.out.println("e = " + e);
		
		
		System.out.println("\n\n---------------------- Prefix and Postfix increment-------------------------");
		
		int ab = 10;
//		System.out.println(ab++);
		System.out.println(++ab);
		
		
		System.out.println("\n\n---------------------- Is number divisible by 2 and 3, by 2 or 3-------------------------");
		
		//Ask user for an int
		//Is the number divisible by 2 and 3 or if it is divisible by 2 or 3
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		int number = input.nextInt();
		
		if(number % 2 == 0 && number % 3 == 0)
		{
			System.out.println(number + " is divisible by 2 and 3");
		}
		if(number % 2 == 0 || number % 3 == 0)
		{
			System.out.println(number + " is divisible by 2 or 3");
		}
		//if you want to check whether it is divisible by 2 or 3 but not both
		if(number % 2 == 0 ^ number % 3 == 0)//exclusive
		{
			System.out.println(number + " is divisible by 2 or 3, but not both!");
		}
		
		System.out.println("\n\n---------------------- Sample program-------------------------");
		
		//Leap year
		//Year divisible by 4 and not divisible by 100, or divisible by 400.
		
//		int year = input.nextInt();
		int year = input.nextInt();
		
//		if ((x % 4 == 0 && !(x  % 100 == 0)) || x % 400 == 0)
//		{
//			System.out.println("It is a leap year");
//		}
//		else
//		{
//			System.out.println("Not a leap year");
//		}	
		
		
		boolean isLeapYear =(year % 4 == 0);
		isLeapYear = isLeapYear && (year % 100 != 0);
		isLeapYear = isLeapYear || (year % 400 == 0);
		
		
		input.close();
	}//End of main
}
