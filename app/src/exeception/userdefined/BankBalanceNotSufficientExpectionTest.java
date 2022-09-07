package exeception.userdefined;

import java.util.Scanner;

public class BankBalanceNotSufficientExpectionTest {
	public static void main(String[] args) {
		
		double balance = 10000.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter withdraw amount");		
		double withdraw = sc.nextDouble();
		
		if(balance > withdraw )
		{
			System.out.println("money withdraw successfully");
		}
		else
		{
			System.out.println("bank balance is sufficient");
			
		}
	}	
}
