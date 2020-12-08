package unit_1_PrimitiveTypes;

public class ShowCurrentTime
{
	public static void main(String[] args)
	{
		//Number of milliseconds from Jan 1, 2020
		long totalMilliseconds = System.currentTimeMillis();
		System.out.println(totalMilliseconds);
		
		long seconds = totalMilliseconds / 1000;
		System.out.println("seconds: " + seconds);
	}
}
