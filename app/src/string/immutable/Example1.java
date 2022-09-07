package string.immutable;

public class Example1 {
	public static void main(String[] args) {
		
			//immutable
		String s ="abc";
		s.concat("xyz");
		
		System.out.println(s); // abc 
		
			//mutable
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		
		System.out.println(sb);
			
			//mutable
		StringBuilder sb1 = new StringBuilder();
		sb1.append("abc");
		sb1.append("xyz");
		
		System.out.println(sb1);
		
		
	}
}
