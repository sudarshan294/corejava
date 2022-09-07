package exeception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		
	
	String s = null;
	try
	{
		int count = s.length();
		System.out.println(count);	
	}
//	catch (NullPointerException e) 
//	{
//		System.out.println("NullPointerException");
//	}
	catch(Exception e) {
		System.out.println("NullPointerException");
	}

   }
}
 