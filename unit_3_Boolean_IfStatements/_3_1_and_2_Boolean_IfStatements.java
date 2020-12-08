package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class _3_1_and_2_Boolean_IfStatements
{
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		
//		int numberWheels = 0;
//		
//		System.out.println("How many wheels does the vehicle have? ");
//		numberWheels = scan.nextInt();
//		
//		if(numberWheels == 2) 
//		{
//			System.out.println("It is a scooter!");
//			System.out.println("I like scooters");
//		}
//		
//		System.out.println("End of program");

		System.out.println("\n\n---------------------- Flow of control -------------------------");
//		
//		System.out.println("1");
//		//If true
//		if(true)
//		{
//			System.out.println("2");
//		}
//		System.out.println("3");
//		
//		
//		
//		System.out.println("\n\n---------------------- Divisible number -------------------------");
//		
//		System.out.println("Give me a number: ");
//		
//		int divisible = scan.nextInt();
//		//divisible by 5
//		if(divisible % 5 == 0)
//		{
//			System.out.println("High five!!");
//		}
//		if(divisible % 3 == 0)
//		{
//			System.out.println("High three??");
//		}
//		
		
		System.out.println("\n\n---------------------- precedence-------------------------");
		int x = 10;
		
		if(x*3/5+12 <= 15)
		{
			System.out.println("Greater or equal to 15");
		}
		
		scan.close();
	}//End of main
	
}//End of class
