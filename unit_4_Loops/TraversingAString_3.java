package unit_4_Loops;

public class TraversingAString_3
{
	
	public static void main(String[] args)
	{
		System.out.println("\n\n--- Concatenate 4 to 1-----");
		//From 4 to 1
		String str = "loop";
		String newStr = "";
		for(int i = str.length(); i > 0; i--)//4 iterations
		{
			newStr += str.substring(i - 1, i); //What char to add
		}
		
		System.out.println("Result of loop backwards: " + newStr);
		
	}//End of main
	
}
