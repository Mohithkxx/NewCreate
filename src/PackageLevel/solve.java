package PackageLevel;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class solve {
	
	public static void main(String[] args) {
		
		Set<String> w = new HashSet<>();
		
		Set<Object> r = new LinkedHashSet<>();
		
		w.add("mohith");
		w.add("mohith");
		w.add("mohith");
		
		System.out.println(w);
	}

}
