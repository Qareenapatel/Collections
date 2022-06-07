package treemap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Ruby");
		
		System.out.println(map);
		
     	//map.forEach(k,v) -> System.out.println("key =" + k + "value =" + v));

		System.out.println(map.lastKey());
		 
		System.out.println(map.firstKey());
		
		Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
		System.out.println(keysLessThan3k);
		
		Set<Integer> keysGrThan3k = map.tailMap(3000).keySet();
		System.out.println(keysGrThan3k);
			

TreeMap<Integer,String> map1 = new TreeMap<>(Comparator.reverseOrder());
		
		map1.put(1000, "Tom");
		map1.put(2000, "Peter");
		map1.put(3000, "Steve");
		map1.put(11000, "Naveen");
		map1.put(1400, "Ruby");
		
		System.out.println(map1);
	}

};
