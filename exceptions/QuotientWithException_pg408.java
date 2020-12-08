package exceptions;
import java.util.Scanner;
public class QuotientWithException_pg408
{
	public static int quotient(int number1, int number2)
	{
		if(number2 == 0)
		{
			throw new ArithmeticException();
		}
		return number1 / number2;
	}
	
	public static void main(String[] args)
	{
		//Instantiate a scanner
		Scanner scan = new Scanner(System.in);
		
		//read numbers
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		
		
		//Perform method call
		try
		{
		int result = quotient(num1, num2);
		System.out.println("The result is: " + result);
		}
		catch(ArithmeticException ball)
		{
			System.out.println(ball + " You divided by zero");
		}
		//Close scanner
		scan.close();
	}//End of main
	
	
	
	

}//Close class
