package exeception;

import java.util.InputMismatchException;

public class FinallyExample3 {
	public static void main(String[] args) {
		
		System.out.println("main method start..");
		
		try {
			System.out.println("try block start...");
			int i= 500/0;
			System.out.println(i);
			
			System.out.println("try block end...");
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}
		catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
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


//main method start..
//try block start...
//ArithmeticException
//finally
//main method end
// Q. how the final main method execute ?
//ans. the rising expection proper we will handling program will successfully Execute