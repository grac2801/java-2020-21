package unit_3_Boolean_IfStatements;

import java.util.Scanner;

public class WhileLoopsScope_4_Extra
{
	
	//Scope of variables.
	public static void main(String[] args)
	{
		String mystery = null;//Don't type until later
		
		Scanner scan = new Scanner(System.in);
		String school = new String("BVH");
		System.out.println("Enter a word: ");
		String myWord = scan.next();
		myWord = myWord.toUpperCase();
		if(myWord.equals(school))
		{
			mystery = "mystery solved";
			System.out.println(mystery);
		}
		else
		{
			mystery = "Unsolved";
			System.out.println(mystery);
		}
		
		System.out.println("Mystery: " + mystery);
		
		scan.close();
	}//Close main
	
}
