package unit_1_PrimitiveTypes;

public class PuttingItTogether
{
	
	public static void main(String[] args)
	{
		//Complete this as an exercise
		long totalMilliseconds = System.currentTimeMillis();
		System.out.printf("# of Milliseconds: %,d", totalMilliseconds);
		/*
		 * Convert this number into hours, minutes, and seconds
		 */
		//Obtain seconds
		long totalSeconds = totalMilliseconds / 1000;
		System.out.printf("\nSeconds: %,d", totalSeconds);
		
		//Obtain current seconds
		long currentSeconds =  totalSeconds % 60;
		System.out.println("\nCurrent seconds: " + currentSeconds);

		//current time: 09:17:08

	}
	
}
