package exeception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExpcetionExample {
	public static void main(String[] args) {
		System.out.println("enter age");
		
		Scanner sc = new Scanner(System.in);
		
		try 
		{
			int age = sc.nextInt();
			
			System.out.println("Entered name is :"+age);
		}
		catch(NullPointerException e) {
			System.out.println("InputMismatchException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println("main method end");
	}
}
