package unit_4_Loops;

import java.util.Scanner;

public class Tracing
{
	
	public static void main(String[] args) throws InterruptedException
	{
		final int ONE_SECOND = 1000;
		System.out.println("\n\n---------------------- post increment-------------------------");
		
		int num1 = 21; //initializes
		while(num1 < 33)//condition
		{
			System.out.println("num1: " + num1);
			num1++;//increment by 1
			Thread.sleep(1000);
		}
		
		
		System.out.println("\n\n---------------------- pre increment-------------------------");
		int num2 = 21; //initializes
		while(num2 < 33)//condition
		{
			num2++;//increment by 1
			System.out.println("num2: " + num2);
			Thread.sleep(ONE_SECOND);
		}
		
		
		System.out.println("\n\n---------------------- Another algorithm-------------------------");
		
		int num3 = 13475;
		while(num3 != 0)
		{
			num3 /= 10;
			System.out.println("num3: " + num3);
			Thread.sleep(ONE_SECOND);
		}
		System.out.println("End of loop!!");
		
		
		
		//Mystery
		Scanner scan = new Scanner(System.in);
		int num4 = scan.nextInt();
		int prod = 1;
		while(num4 > 0)
		{
			prod = prod * num4;
			num4--;
		}
		System.out.println("Prod: " + prod);
		
		scan.close();
	}//end of main
	
}
