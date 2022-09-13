package collectionfw.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;     // shorting order


public class WaysToiterateset {
	public static void main(String[] args) {
		
		Set<Object> set = new TreeSet<>();
		
		set.add("abc");
		set.add("xyz");
		set.add("aaa");
		set.add("bbb");
		set.add("abc");
		set.add("xyz");
		
		System.out.println(set);
		
		System.out.println("Using Enhanced for loop............" );
		for(Object data :set)
		{
			System.out.println(data);
		}
		
		
		System.out.println("Using iterator.......");		
		Iterator<Object> it = set.iterator();
		
		while(it.hasNext())
				{
					System.out.println(it.next());
				}
		
	}
}
