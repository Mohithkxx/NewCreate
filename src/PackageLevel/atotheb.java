package PackageLevel;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class atotheb {
	
	public static void main(String[] args) {
		
	
	
	Map<Object, Object> ob = new HashMap<Object, Object>();
	
	ob.put(1, "Mohith");
	ob.put(2, "Mohith");
	//ob.put(1, "Mohith");
	ob.put(1, 34);
	ob.put(null, null);
	
	
	System.out.println(ob);
	
	Map<Object, Object> bo = new LinkedHashMap<>();
	
	bo.put(1, "Mohith");
	bo.put(1, "Mohith");
	bo.put(2, "Mohith");
	bo.put(4, 67);
	bo.put(null, null);
	bo.put(null, null);
	
	System.out.println(bo);
	
	}
}
