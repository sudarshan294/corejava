package collectionfw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WaysTolterateList {
	
	public static void main(String[] args) {
		
		List list = new ArrayList(); 
		
		list.add("G");
		list.add("Sudarshan");
		list.add("Reddy");
		list.add("sidhu");
		
		// Using normal for loop
		System.out.println("Using normal for loop-------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		
		System.out.println("Using Enhanced for loop--------------");
		for(Object s : list ) {
			System.out.println(s);
		}
		
		System.out.println("Using iterator-------");
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Using listiterator-------");
		ListIterator lit = list.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		}
	}
	
}
