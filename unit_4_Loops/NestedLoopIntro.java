package unit_4_Loops;

public class NestedLoopIntro
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)//row
		{
			System.out.println("\nNext i");
//			System.out.println("i: " + i);
			for (int j = 1; j <= 5; j++)
			{
//				System.out.print("j: " + j);
				System.out.print("Hi there\t");
			}
		}
	}//End of main
}