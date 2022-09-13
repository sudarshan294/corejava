package collectionfw.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIterateMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

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

		
		System.out.println("Using entrySet with enhanced for loop .........");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry<Integer, String > entry : entries) {
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
		
		
		System.out.println("Using entrySet with iterator..........");
		@SuppressWarnings("rawtypes")
		Iterator it1 = entries.iterator();
		while(it1.hasNext()) {
	
			System.out.println(it1.next());
		}


		System.out.println("Using Keyset with enhanced for loop ..........");

		@SuppressWarnings("rawtypes")
		Set keys = map.keySet();
		for(Object key : keys) {
			System.out.println(key+ " = "+ map.get(key));
		}

		
		System.out.println("Using Keyset with iterator........");
		@SuppressWarnings("rawtypes")
		Iterator it2 = keys.iterator();
		while(it2.hasNext()) {
			Object key = it2.next();
			System.out.println(key+" = "+map.get(key));	
		}
	}
}
