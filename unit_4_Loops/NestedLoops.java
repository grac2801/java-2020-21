package unit_4_Loops;

public class NestedLoops
{
	public static void main(String[] args)
	{
		for(int i = 1; i <= 6; i++)
		{
			System.out.println("**********");
		}
		
		System.out.println("\n\n------ Nesting loops-------");
		
		//6 lines of stars in each (10 stars in each)
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= 10; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}//End of outer for loop
		
		System.out.println("\n\n----- Another example-------");
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n----Illegal use of counter-------");
		int squared = 0;
		for(int i = 1; i <= 5; i++)
		{
			squared = i * i;
			System.out.println(i + " squared: " + squared);
		}
		System.out.println("Last squared = " + squared);
		
		
		
		
		System.out.println("\n\n----counter declared outside of loop-------");
//		int i;
//		for(i = 1; i <= 5; i++)
//		{
//			System.out.println(i + "[squared] = " + i * i);
//		}
//		
		
		System.out.println("\n\n----Repeat each letter 3 times -------");
		String str = "Gracias";
		for(int i = 0; i < str.length(); i++)
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(str.substring(i, i + 1));
			}
			System.out.println();
		}
		
		
		/*
		 * Student practice: Make a nested loop which prints:
		 * 4
		 * 34
		 * 234
		 * 1234
		 */
		for(int j = 4; j > 0; j--)
		{
			for(int k = j; k < 5; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		//Print a word backwards 5 times
		String name = "emily";
		for(int i = 0; i < 10; i++)
		{
			for(int j = name.length() - 1; j >= 0; j--)
			{
				System.out.print(name.charAt(j));
			}
			System.out.println();
		}
		
		
	}//End of main
}
