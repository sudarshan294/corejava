package exeception;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("method will start");
		
		int i = 33873;
		int j = 0;
		
		try
		{
			int k = i/j;
			System.out.println(k);
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		
		catch (RuntimeException e) {
			System.out.println("ArithmeticException");
		}
				
		System.out.println("method will end");
		System.out.println("method will end");
		System.out.println("method will end");
		System.out.println("method will end");
		System.out.println("method will end");
	}
}
