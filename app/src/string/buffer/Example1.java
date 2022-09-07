package string.buffer;

public class Example1 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("sidhu");
		sb.append("badboy");
		
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
	}
}
