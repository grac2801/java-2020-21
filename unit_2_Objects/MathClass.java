package unit_2_Objects;

import java.util.Scanner;

public class MathClass
{
	public static final int daysOfTheWeek = 7;
	public static final double luckyNumber= 5.765343849;
	
	public static void main(String[] args)
	{
		//double myNewAnswer = Math.PI * 45;
//		daysOfTheWeek = daysOfTheWeek + 1;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\n---------------------- Absolute value -------------------------");
		
		
//		System.out.println("Please enter 2 ints: ");
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		
//		System.out.println("Please enter 2 doubles: ");
//		double a = scan.nextDouble();
//		double b = scan.nextDouble();
//		
//		System.out.println("Answers: " );
//		System.out.println(Math.abs(x - y));
//		System.out.println(Math.abs(a - b));
		
		System.out.println("\n\n---------------------- Power-------------------------");
		int i1 = 2;
		int i2 = 5;
		System.out.println("Answers of power: " + Math.pow(i1, i2));//Autoboxing
		
		System.out.println("\n\n---------------------- Square root -------------------------");
		
		//double answer = Math.sqrt(8);
		System.out.println("Square root of 5: " + Math.sqrt(i2));
		System.out.printf("%.2f", Math.sqrt(i2));

		System.out.println("\n\n---------------------- Random-------------------------");
		
		System.out.println((int)(Math.random() * 100) + 1);//Randomizer between 1 - 100
		
		
		//Randomizer between -20 to +20
		System.out.println((int)(Math.random() * 41) + -20);
		
		//Random number between 1 and 1,000,000 with comma separators
		System.out.printf("%,d%n", (int)(Math.random() * 1_000_000) + 1);

		
		//Random number between 17 and 43
		System.out.println((int)(Math.random() * 27) + 17);
		
		scan.close();
	}
	
}
