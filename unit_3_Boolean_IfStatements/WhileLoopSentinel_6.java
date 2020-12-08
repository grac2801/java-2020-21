package unit_3_Boolean_IfStatements;
import java.util.Scanner;
public class WhileLoopSentinel_6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//Read initial data
		System.out.println("Enter an integer: [0 to end]");
		
		int data = scan.nextInt();
		
		int sum = data;//later
		
		while(data != 0)
		{
			System.out.println("Enter an integer: [0 to end]");
			data = scan.nextInt();
			sum += data;
			System.out.println("So far, you have a sum of " + sum);
			
		}
		
		System.out.println("Total: " + sum);
		scan.close();
	}
}
