package exeception;

public class IndexOutOfBoundsExpectionExample {
	public static void main(String[] args) {
		String s="sudarshan";
		
		try {
			char c = s.charAt(60);
			System.out.println(c);
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("main method end.....");
	}
}
