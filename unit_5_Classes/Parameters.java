package unit_5_Classes;

import java.util.Scanner;

public class Parameters
{
	
	//Method signature
	public static void sum(int first, int second)//Formal parameters
	{
		System.out.println("The sum is: " + first + second);
		System.out.println("The sum is: " + (first + second));
		System.out.println(first + second + " at the end");
	}
	
	
	public static void squareIt(double first)
	{
		first = Math.pow(first, 2);
		System.out.println(first);
	}
	
	public static void addOneTo_c(int c)
	{
		c++;
		System.out.println("c from method = " + c);
	}
	
	public static void powerOfParameter(double x)
	{
		System.out.println(Math.pow(2, x));
	}
	
	private static void moreThanTwo(Scanner zap, String name, int age)
	{
		zap.nextLine();
		System.out.println("Enter your name: ");
		zap.nextLine();
		System.out.println("Enter your age: ");
		age = zap.nextInt();
		System.out.println("Your name is: " + name + ", and your age is: " + age);
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter int a: ");
		int a = scan.nextInt();
		System.out.println("Enter int b: ");
		int b = scan.nextInt();
		//Call method sum and pass a and b as parameters
		sum(a, b);//Actual parameters or arguments
		
		/*
		 * Write a method called squareIt that takes
		 * a double parameter and prints its square
		 * example: 7.0^2 = 49.0
		 */
		squareIt(7.0);
		
		//Value is not to be copied into parameter
		//but is changed in the main value
		System.out.println("Enter c: ");
		int c = scan.nextInt();
		addOneTo_c(c);
		System.out.println("c from main: " + c);
		int n = 7;
		powerOfParameter(n);
		moreThanTwo(scan, "Mr. Gracias", 49);
		
		scan.close();
	}











}
