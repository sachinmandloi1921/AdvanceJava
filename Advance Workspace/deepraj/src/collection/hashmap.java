package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hashmap {
	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("1", "One");
		m.put("2", "Two");
		m.put("3", "Three");
		m.put("4", "four");
		
		int size = m.size();
		String value = (String)m.get("3");
		m.remove("1");
		
		boolean flag = m.containsKey("1");
		flag = m.containsValue("four");
		Set keys = m.keySet();
		for(Object K:keys) {
			System.out.println(K);
		
		}
		Collection values = m.values();
		Set keyvalue = m.entrySet();
		
	}

}
