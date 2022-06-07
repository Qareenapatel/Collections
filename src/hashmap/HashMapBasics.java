package hashmap;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {
		
		HashMap<String,String> capMap = new HashMap<String,String>();
		
		capMap.put("India", "New Delhi");
		capMap.put("USA", "Washington DC");
		capMap.put("Canada", "Ottawa");
		capMap.put("UK", "London");
		capMap.put("UK", "London11");
		capMap.put(null, "Germany");
		capMap.put(null, "Berlin");
		

		System.out.println(capMap.get("USA"));
		System.out.println(capMap.get("UK"));
		System.out.println(capMap.get(null));
 
		
		
		//Iterator: over the Keys: by using keySet()
		
		Iterator<String> it = capMap.keySet().iterator();
	
		while(it.hasNext())
		{
			String key = it.next();
			String value = capMap.get(key);
			System.out.println("Key = "+ key + "Value = "+ value);
		}
		
		System.out.println("----------------");
		
		//Iterator hashmap using for each and lamda
		{
		//capMap.forEach(k,v)->  
		//System.out.println("key ="+ k + "and value ="+ v);
		
		
		
		} 
	}
}

		
		
		
		
		
		
		
	
	


