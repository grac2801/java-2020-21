package exceptions;

import java.util.Scanner;

public class QuotientWithException
{
	public static int quotient(int number1, int number2)
	{
		if(number2 == 0)
		{
			throw new ArithmeticException();
		}
			return number1 / number2;
		
	}//End of method
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		try
		{
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + ": " + result);
		}
		catch (ArithmeticException zero)
		{
			System.out.println("Exception: an integer can not be zero");
		}
		
		System.out.println("Execution continues");
		
		input.close();
	}
}
