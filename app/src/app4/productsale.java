package app4;

import java.util.Scanner;

public class productsale {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter product name ");
		String productname = sc.nextLine();
		
		System.out.println("enter product price");
		double p = sc.nextDouble();
		
		System.out.println("enter qty");
		int qty = sc.nextInt();
		
		double ps = p*qty;
		System.out.println(productname+"  "+ps);
	}
}
