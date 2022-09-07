package exeception.userdefined;

import java.util.Scanner;

public class AgeNotSufficientExeceptionTest {
	public static void main(String[] args) {
		
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age >= 70) {
			throw new AgeNotSufficientExeception("for this age this policy is not appilcable");
			
		}
		else {
			System.out.println("proceed.....");
		}
	}
}
