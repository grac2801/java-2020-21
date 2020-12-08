package exceptions;
import java.util.*;
public class Quotient
{
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Prompt the use to enter two integers
		System.out.println("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if(number2 != 0)
		{
			System.out.println(number1 + " / " + number2 + " is = " + (number1/number2));
		}
		else
		{
			System.out.println("Divisor cannot be zero");
		}
		
		input.close();//Close scanner
		
	}//End of main
	
}//end of class
