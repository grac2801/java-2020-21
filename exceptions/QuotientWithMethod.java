package exceptions;

import java.util.Scanner;

public class QuotientWithMethod
{
	
	public static int quotient(int number1, int number2)
	{
		if(number2 == 0)
		{
			System.out.println("Divisor can not be zero!");
//			 Runtime.getRuntime().exit(1); 
			 //same as:
			 System.exit(1);
		}
			return number1 / number2;
		
	}//End of method
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		int result = quotient(num1, num2);
		System.out.println(num1 + " / " + num2 + ": " + result);
		input.close();
	}
	
}
