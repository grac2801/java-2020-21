package unit_4_Loops;


import java.util.Scanner;
public class AlgorithEfficiency
{
	public static void main(String[] args)
	{
		System.out.println("Enter a string: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		boolean unique = true;
		int count = 0;
	    for(int i = 0; i < s.length(); i++)
		{
			for(int j = 0; j < s.length(); j++)
			{
				count++;
				if(s.substring(i, i + 1).equals(s.substring(j, j + 1)) && i != j )
				{
					unique = false;
				}
			}//inner loop

		}
		if(unique == true)
		{
			System.out.println("This is a unique character string. No characters repeat");
		}
		else
		{
			System.out.println("This is not a unique character string");
		}
		System.out.println("count: " + count);
		


		/*
		Second attempt ------------------------------------------------------
		*/

		int count1 = 0;
		boolean unique1 = true;
		for(int i = 0; i < s.length() - 1; i++)
		{
			for(int j = i + 1; j < s.length(); j++)
			{
				count1++;
				if(s.substring(i, i + 1).equals(s.substring(j, j + 1)))
				{
					unique1 = false;
				}
			}
		}//End of outer loop
		if(unique1 == true)
		{
			System.out.println("alg_2: This is a unique character string. No characters repeat");
		}
		else
		{
			System.out.println("alg_2: This is not a unique character string");
		}
		System.out.println("count1: " + count1);
		


		// 3rd way to make this same algorithm
		boolean unique2 = true;
		int i = 0;
		int count2 = 0;
		while(unique2 == true && i < s.length() - 1)
		{
			int j = i + 1;
			while(unique2 == true && j < s.length())
			{
				count2++;
				if(s.substring(i, i + 1).equals(s.substring(j, j + 1)))
				{
					unique2 = false;
				}
				j++;
			}
			i++;
		}
		System.out.println("count2: " + count2);

		scan.close();
	}//End of main
}
