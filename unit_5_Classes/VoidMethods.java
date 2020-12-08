package unit_5_Classes;

import java.util.Scanner;

public class VoidMethods
{
	public static void doStuff()
	{
		System.out.println("This is from static method");
	}
	
	public void printJava()
	{
		System.out.println("JAVA");
	}
	
	
	public static void mysteryFunction()
	{
		//Scanner bug = From String to int --> OK
		//Scanner bug = From int to String --> not OK
		Scanner scan = new Scanner(System.in);
		int fiveToFifteen = (int)(Math.random() * 11) + 5;
		int twoAndFive = (int)(Math.random() * 4) + 2;
		int product = fiveToFifteen * twoAndFive;
		int sqrRt = (int)Math.sqrt(product);
		System.out.println("What is your name? ");
		String name = new String();
		name = scan.nextLine();
		System.out.println("What is your lucky number? ");
		int luckyNumber = scan.nextInt();
		System.out.println("Enter character: !, *, $: ");
		scan.nextLine();
		String character = scan.nextLine();
		System.out.printf("%s%d%s%-2d", name, luckyNumber, character, sqrRt);
		
		scan.close();
	}

	
	
	
	public static void main(String[] args)
	{
		System.out.println("This is in main");
		doStuff();
		VoidMethods myObj = new VoidMethods();
		myObj.printJava();
		mysteryFunction();
		
	}


	
	/* Make a function called mysteryFunction(). it 
	 * will choose a random number between 5 and 15, 
	 * and then, multiply it by a random number between 
	 * 2 and 5. 
	 * Get the square root of it 
	 * Ask the user for her/his first name
	 * Ask user for lucky number
	 * Ask user for a character !, *, or $
	 * Order this data as follows:
	 * print --> name, lucky number, character, random product(only 2 digits)
	 */
	
	
}
