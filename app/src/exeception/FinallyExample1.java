package exeception;

public class FinallyExample1 {
	public static void main(String[] args) {
		
		try {
			System.out.println("JDBC/ File connection opened...");
			//opened JDBC/ file connection
			
			int i = 1790/0;
			System.out.println(i);
			// Closeing Connection.....
			System.out.println("inside try, JDBC/ File connection... ");
		} 
		catch (NullPointerException e) {
			// Closeing Connection.....
			System.out.println("inside catch, JDBC/ File connection... ");
		}
		finally {
			
			System.out.println("inside finally, JDBC/ File connection... ");
		}
	}
}
