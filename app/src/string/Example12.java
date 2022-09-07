package string;

public class Example12 {
	public static void main(String[] args) {
		
		String s = "abc"; //object creation with string literalway
		String s1 = new String ("abc"); //object creation using new keyword 
		
		System.out.println(s.equals(s1));  // true
		System.out.println(s == s1);		//false
		
		
	}
}
