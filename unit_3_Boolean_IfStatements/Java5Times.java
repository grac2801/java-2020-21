package unit_3_Boolean_IfStatements;

public class Java5Times
{
	
	public static void main(String[] args)
	{
		//Loops forever
		int counter = 0;//change to 1 for other options
//		while(counter < 5)
//		while(counter <= 5)
		while(!(counter >= 5))
		{
			//++counter; works
			System.out.println(counter + ": Java");
			counter += 1;
		}
	}
	
}
