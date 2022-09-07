package exeception;

import java.util.InputMismatchException;

public class MultipleCatchExample {
	public static void main(String[] args) {
		System.out.println("main method start..");

		try {
			System.out.println("try block start...");
			int i= 500/0;
			System.out.println(i);

			System.out.println("try block end...");
		}
		
		// This concept introduced from java 1.7 onwards
		catch (NullPointerException |ArithmeticException |InputMismatchException e) {      //<----- java 7 onwards....
			System.out.println("NullPointerException");
		}
		catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		catch (Throwable e) {
			System.out.println("Throwable");
		}

		finally
		{
			System.out.println("finally");
		}
		System.out.println("main method end");

	}
}
