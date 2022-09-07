package exeception.userdefined;

import java.util.Scanner;

public class ProductsNotAvalibleTest {
	

	private static final int produts = 100;

	public static void main(String[] args) {

		System.out.println("Enter produts");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if( produts >= 500) {
			throw new ProductsNotAvalible("for this much products is out of stock");

		}
		else {
			System.out.println("Available.....");
		}
	}
}