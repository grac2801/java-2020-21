package unit_5_Classes;

public class BookMain
{
	
	public static void main(String[] args)
	{
		Book b = new Book("Deitel", "Build Java programs", 2000);	
		System.out.println(b);
		System.out.println();
		Book c = new Book("Hamster", "C++", 1978);
		System.out.println(c);
		
		System.out.println("--- Are they equal? ---");
		boolean same = b.equals(c);
		System.out.println("Answer: " + same);
	}
	
}
