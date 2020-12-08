package unit_4_Loops;

import java.util.Scanner;

public class ForLoop_Intro
{
	
	public static void main(String[] args)
	{
		//I want to print all EVEN numbers from 20 - 100
		// 3 parts: initialize, condition, increment
		
		System.out.println("\n\n---------------------- 1-Number of iterations -------------------------");
//		for(int i = 0; i <= 81; i++)
//		{
//			if(number % 2 == 0)
//			{
//				System.out.println("i: " + number);
//			}
//			number++;
//		}//End of loop
		
		
		System.out.println("\n\n---------------------- 2- Change the index -------------------------");
		
		for(int i = 20; i <= 100; i++)
		{
			if(i % 10 == 0)
			{
				System.out.println();
			}
			if(i % 2 == 0)
			{
				System.out.print("i: " + i + " ");
			}
		}
		
		
	System.out.println("\n\n---------------------- 3- Augmented assignment -------------------------");
	
	for(int j = 20; j < 101; j += 2)
	{
		if(j % 10 == 0)
		{
			System.out.println();
		}
		System.out.print("j: " + j + " ");
	}
	
	System.out.println("\n\n---------------------- 4- Using the while loop -------------------------");
	
	int number = 20;
	while(number <= 100)
	{
		if(number % 10 == 0)
		{
			System.out.println();
		}
		if(number % 2 == 0)
		{
			System.out.print("i: " + number + " ");
		}
		number += 2;
	}
	
	System.out.println("\n\n---------------------- 5- Loop through a String -------------------------");
	
	String str = new String("Darrius");
	for(int i = 0; !(i > str.length() - 1); i++)
	{
		System.out.println(str.substring(i, i + 1));
	}
	
	
		/*
		 * Ask the user to input a number, and then you will add every number
		 * below it by one, and provide a sum
		 * i.e. (4) --> 4 + 3 + 2 + 1 = 10
		 */
	
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	System.out.println("Enter a number to find the sum of: ");
	int n = scan.nextInt();
	
	for(int i = n; i > 0; i--)
	{
		sum += i;
	}
	
	System.out.println("The sum is: " + sum);
	
	scan.close();
	
	}//End of main
	
}//End of class
