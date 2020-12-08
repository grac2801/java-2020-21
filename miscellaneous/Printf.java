package miscellaneous;

public class Printf
{
	
	public static void main(String[] args)
	{
		String var = "Java";
		int num1 = 234_786;
		
		System.out.printf("%,010d %-10s %-10d\n", num1, var, 5280);
		System.out.printf("%,-10d %,-10.2f", 4795, 9_389.878);


	}
	
}
