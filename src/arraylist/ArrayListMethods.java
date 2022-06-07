package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JavaScript");
		
		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("Testing");
		ar2.add("Dev ops");
		
		/*ar1.addAll(ar2); //add all together
		System.out.println(ar1);
		
		ar1.addAll(2,ar2); // change the add position
		System.out.println(ar1);
		
		ar1.clear();// clear ar1
        System.out.println(ar1); */
        
        ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
        System.out.println(cloneList);
		
        System.out.println(ar1.contains("Python"));
        System.out.println(ar1.contains("c"));
        
        System.out.println(ar1.indexOf("Ruby"));
        
        ArrayList<String> list1 =  new ArrayList<String>(Arrays.asList("Naveen", "Tom","Naveen","Steve","Lisa","John"));
        System.out.println(list1);
        
        int i =list1.lastIndexOf("Naveen");
        System.out.println(i);
        
        list1.remove(1);
        System.out.println(list1);
        
        list1.remove("Lisa");
        System.out.println(list1);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num -> num%2-1 ==0);
        System.out.println(numbers);
        
        
        ArrayList<String> list2 =  new ArrayList<String>(Arrays.asList("Naveen", "Tom","Isha","Steve","Lisa","John"));
        System.out.println(list2);
        
        list2.retainAll(Collections.singleton("Tom"));
        System.out.println(list2);
        
        
        
        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2, 7));
        System.out.println(subList);
        
        ArrayList<String> list3 =  new ArrayList<String>(Arrays.asList("Naveen", "Tom","Peter","Steve","Lisa","John"));
          
        Object arr[] = list3.toArray();
        System.out.println(Arrays.toString(arr));
        
        for(Object o : arr)
        	System.out.println((String)o);
        
        
        
        
        
	}

}
