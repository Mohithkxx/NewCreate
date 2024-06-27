package PackageLevel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
	
	public static void main(String[] args) {
		
		Map<Object, Object> ref = new HashMap<Object, Object>();
		
		ref.put(1, "Mohith");
		ref.put(1, "Mohith");
		ref.put(1, "Kumar");
		ref.put(2, "Mohith");
		ref.put(null, null); //null accepts only one time
		ref.put(null, null);
		
		System.out.println(ref);
		
		System.out.println(ref.size());
		
		//containskey
		
		System.out.println(ref.containsKey(2));
		
		//containsvalue
		
		System.out.println(ref.containsValue("Mohith"));
		
		//isEmpty
		
		System.out.println(ref.isEmpty());
		
		//remove
		
		//ref.remove(1);
		
		//System.out.println(ref);
		
		//ref.remove(null, null);
		
		System.out.println(ref);
		
		//get key
		
		System.out.println(ref.get(10));
		
		
		//keyset
		
		//ref.keySet();
		
		System.out.println(ref.keySet());
		
		//values
		
		System.out.println(ref.values());
		
		//entryset - pending
		
		System.out.println(ref.entrySet());
		
		Map<Object, Object> lhm = new LinkedHashMap<Object, Object>();
		
		lhm.put(1, "Mohith");
		lhm.put(1, "Mohith");
		lhm.put(1, "kumar");
		lhm.put(2, "Mohith");
		lhm.put(null, null);
		lhm.put(null, null);
		lhm.put(12.3,874);
		lhm.put(true,false);
		
		
		System.out.println(lhm);
		
		Map<String, Object> tm = new TreeMap<String, Object>();
		
		tm.put("JAVA", true);
		tm.put("Selenium", 345);
		tm.put("Cucumber", 'y');
		tm.put("JAVA", true);
		tm.put("JAVA", 12345);
		tm.put("GIT", true);
		tm.put(null, null);  //nullpointer exception
		
		System.out.println(tm);
		
		
		
		
	}

}
