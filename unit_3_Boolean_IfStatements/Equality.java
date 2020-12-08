package unit_3_Boolean_IfStatements;

public class Equality
{
	
	public static void main(String[] args)
	{
		System.out.println("\n\n---------------------- == for Strings-------------------------");
		
		String upper = "HELLO";//location 23Ef4
		String lower = upper;//location 2255f
//		System.out.println(lower.getClass());
//		upper = upper.toLowerCase();
		
		if(upper == lower)
		{
			System.out.println("They are the same!");
		}
		else
		{
			System.out.println("They are NOT the same!");
		}
		
		System.out.println("\n\n---------------------- Equality using a method-------------------------");
		
		if(upper.equals(lower))
		{
			System.out.println("They are the same!");
		}
		else
		{
			System.out.println("They are NOT the same!");
		}
		
		
		
		System.out.println("\n\n---------------------- Equality using numbers-------------------------");
		
		int a = 1;
		int b = a;
		
		if(a == b)
		{
			System.out.println("Both numbers are the same!");
		}
		else
		{
			System.out.println("Both numbers are NOT the same!");
		}
		
		
		
		System.out.println("\n\n---------------------- Equality using Wrapper classes-------------------------");
		
		Integer c = 1;
		Integer d = c;
		if(c.equals(d))
		{
			System.out.println("They are both the same!");
		}
		else
		{
			System.out.println("They are different");
		}
		
		
		System.out.println("\n\n---------------------- Equality using Equality objects-------------------------");
		
		Equality e1 = new Equality();
//		e1 = null;
		Equality e2 = new Equality();
		
//		if(e1 == null)
//		{
//			System.out.println("object has been instantiated, but no content is found");
//		}
		
		
		//Are e1 and e2 the same?
		if(e1.equals(e2)) 
		{
			System.out.println("Both objects are the same!");
		}
		else
		{
			System.out.println("Both objects are NOT the same!");
		}
			

		
	}//End of main
	
}
