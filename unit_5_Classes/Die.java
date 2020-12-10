package unit_5_Classes;

public class Die
{
	private int value;
	private int numSides;
	
	/*constructors
	 * 
	 */
	public Die()
	{
		this(6);
//		roll();
	}

	public Die(int sides)
	{
		this.numSides = sides;
		this.value = (int)(Math.random() * numSides) + 1;
	}

	public int getValue()
	{
		return value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public int getNumSides()
	{
		return numSides;
	}

	public void setNumSides(int numSides)
	{
		this.numSides = numSides;
	}

	public void roll()
	{
		this.value = (int)(Math.random() * numSides) + 1;
	}
	
	
	
	@Override
	public String toString()
	{
		return "The die has a value of: " + getValue() + " in "
				+ "a die with " + getNumSides() + " sides.";
	}
	
	
	
}
