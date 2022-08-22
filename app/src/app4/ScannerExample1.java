package app4;

import java.util.Scanner;

public class ScannerExample1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name ");
		String firstName = sc.nextLine();
		
		System.out.println("enter second name ");
		String secondName = sc.nextLine();
		
		String fullName = firstName+" "+secondName;
		System.out.println(fullName); 	
	}
}
