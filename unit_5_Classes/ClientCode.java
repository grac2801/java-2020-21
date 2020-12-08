package unit_5_Classes;

public class ClientCode {

	public static void main(String[] args) 
	{
		Book b = new Book("Matilda", "Roald Dahl", 88);
		System.out.println(b);
		System.out.println();
		Book c = new Book("Rose in the dark", "Roald Dahl", 88);
		System.out.println(c);
		
		System.out.println("\n\n--- Are they equal? ---");
		boolean same = b.equals(c);
		System.out.println("Answer: " + same);
				
	}

}
