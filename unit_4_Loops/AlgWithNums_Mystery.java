package unit_4_Loops;

import java.util.Scanner;

public class AlgWithNums_Mystery
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while(b != 0)
		{
			int r = a % b;
			a = b;
			b = r;
//			System.out.println("a: " + a);
		}
		
		System.out.println(a);
		
		
		
		scan.close();
	}
	
}
