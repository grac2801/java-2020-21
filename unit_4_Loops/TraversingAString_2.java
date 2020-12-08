package unit_4_Loops;

public class TraversingAString_2
{
	
	public static void main(String[] args)
	{
		System.out.println("\n\n--- Counting 2 letter---------");
		//variables
		int count2 = 0;
		String ph = "ph";
		String word2 = "metamorphosisph";
		
		//loop
		for(int j = 0; j < word2.length() - 1; j++)
		{
			if(word2.substring(j, j + 2).equals(ph))
			{
				count2++;
			}
		}//End of for loop
		
		System.out.println("There are " + count2 + " instances of " + ph);
		
		
		System.out.println("\n\n-- Concatenating strings ---------");
		String str = "loop";
		String newStr = "";
		// 3 --> 0
		for(int i = str.length() - 1; i >= 0; i--)
		{
			newStr += str.substring(i,  i + 1);
		}
		System.out.println("newStr: " + newStr);
		
		
		
		
		
	}
	
}
