package string.buffer;

public class ReverseExample {
	public static void main(String[] args) {
		
		String city = "Tirupathi";
		
		//convert from String to StingBuilder
		
		StringBuilder sb = new StringBuilder(city);
		System.out.println(sb);
		
		sb.reverse();       //-> free define method 
		// convert from StringBuilder to string 
	//	System.out.println(sb);
		
		String s = sb.toString();
		System.out.println(sb);
	}
}
