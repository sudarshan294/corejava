package collectionfw.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("bbb");
		set.add("abc");
		set.add("xyz");
		
		System.out.println(set);
		System.out.println(set.size());
		
		set.remove("abc");
		System.out.println(set);
		
//		set.clear();
//		System.out.println(set);
		
		System.out.println(set.size());
		
		boolean b = set.contains("abc");
		System.out.println(b);
	}
}
