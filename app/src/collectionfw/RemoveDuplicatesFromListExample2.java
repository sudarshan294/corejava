package collectionfw;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromListExample2 {
	public static void main(String[] args) {
		List cities = new ArrayList();

		cities.add("ATP");
		cities.add("Hyd");
		cities.add("Kurnool");
		cities.add("Tripathi");
		cities.add("Vizag");
		cities.add("ATP");
		cities.add("Kurnool");

		System.out.println(cities);
		
		List uniquValues = new ArrayList();
		System.out.println(uniquValues);
		
		for(int i=0; i<cities.size(); i++)
		{
			if(!uniquValues.contains(cities.get(i)))
			{
				uniquValues.add(cities.get(i));
			}
			
		}
		System.out.println(uniquValues);
	}
}
