package collectionfw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String[] args) {
		
	//	ArrayList list = new ArrayList();   
		
		List list = new ArrayList();  // Autoupcasting
		
		list.add("G");
		list.add("Sudarshan");
		list.add("Reddy");
		list.add("sidhu");
		
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		System.out.println(list.size());  //4....
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));  //countines....
		}
		
		list.remove("3");   // numbers or names....
		System.out.println(list);
		
		list.add(0, "first");
		System.out.println(list);
		
		System.out.println(list.contains("nnn")); //flase
		System.out.println(list.contains("sidhu")); //true
		
		list.clear();
		System.out.println(list);
		System.out.println(list.size());  // 0
		
		System.out.println(list.isEmpty()); // true
	}
}
