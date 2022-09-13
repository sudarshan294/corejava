package collectionfw.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new Hashtable<>();

		map.put(1,"abc");
		map.put(2,"aaa");
		map.put(3,"bbb");
		map.put(4,"ccc");
		map.put(5,"ddd");
		map.put(7,"xyz");  
		map.put(6,"sij");
		map.put(8,"auau");  
		map.put(6,"abcds");

		System.out.println(map);
	}
}
