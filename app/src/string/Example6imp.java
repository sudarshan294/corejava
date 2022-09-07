package string;

public class Example6imp {
	
	public static void main(String[] args) {
		// equals & equalsIgnoreCase / compare &
		// ASCII valu of uppercase alphabets - 65 to 90. ASCII valu of lowercase alphabets - 97  to 122 
		
		String s = "abc";
		String s1 = "ABC";
		
		boolean b = s.equals(s1);
		System.out.println(b); //false
		
		boolean b1 = s.equalsIgnoreCase(s1);
		System.out.println(b1);   // true
		
		int b3 = s.compareTo(s1);
		System.out.println(b3);
		
		int b2 = s.compareToIgnoreCase(s1);
		System.out.println(b2); 
	}
	
}
