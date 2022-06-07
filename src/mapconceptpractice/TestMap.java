package mapconceptpractice;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Employee,String> empMap = new HashMap<Employee,String>();
		 
		Employee e1 = new Employee("Naveen", 20);
		empMap.put(e1, "Permenant");
		
		e1.setAge(25);
		empMap.put(e1, "Temp");
		
		System.out.println(empMap.get(e1));
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Tom", 100);
		System.out.println(m1.get("Tom"));
		
		m1.put("Naveen", 200);
		System.out.println(m1.get("Naveen"));
		System.out.println(m1.get("Tom"));

			


	}

}
