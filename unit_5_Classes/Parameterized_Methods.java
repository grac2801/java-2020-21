package unit_5_Classes;

import java.util.Scanner;

public class Parameterized_Methods
{
	public static void sum(int a, int b)
	{
		//Please try without parenthesis
		System.out.println("The sum is: " + a + b);
		System.out.println("The sum is: " + (a + b));
	}
	
	public static void squareIt(double number)
	{
		number = Math.pow(number, 2);
		System.out.println(number);
		
	}//End of method
	
	public static void addOneTo_c(int c)
	{
		c++;
		System.out.println("c: " + c);
		
	}//End of method
	
	public static void powerOfTwo(double x)
	{
	  System.out.println(Math.pow(2, x));
	}
	
	
	public static void moreThanOne(Scanner zap, String name, int age)
	{
		System.out.println("Enter your name: ");
		zap.nextLine();
		name = zap.nextLine();
		System.out.println("Enter your age: ");
		age = zap.nextInt();
		System.out.println("Your name is: " + name + ", and your age is: " + age);
	}// End of method
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter int a: ");
		int a = scan.nextInt();
		System.out.println("Enter int b: ");
		int b = scan.nextInt();
		sum(a, b);
		squareIt(7);
		//TODO: Complete this function
		/* Write a method called squareIt that takes 
		 * a double parameter and prints its square
		 * For example: 7.0^2 = 49.0
		 */
		
		
		//Value is to be copied into method parameter
		//but is not changed in the main value.
		System.out.println("Enter c:  ");
		int c = scan.nextInt();
		addOneTo_c(c);
		System.out.println("c: " + c);
		
		
		//n integer is not used, only the 'n' or 110
//		int n = 7;
		powerOfTwo('n');
		System.out.println(Math.pow(2,(int)'n'));
		System.out.println('\u006E');
		
		moreThanOne(scan, "Mr. Gracias", 49);
		//More than one parameter
		scan.close();
	}
}
