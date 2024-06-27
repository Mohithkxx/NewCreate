package PackageLevel;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	
	public static void main(String[] args) {
		
		Set<Object> name = new HashSet<Object>();
		
		name.add("Mohith");
		name.add(3900);
		name.add('7');
		name.add("Mohith");
		name.add('7');
		name.add("");
		name.add("");
		name.add(null);
		
		
		System.out.println(name);
		
		name.remove(3900);
		
		System.out.println(name);
		
		System.out.println(name.size());
		
		System.out.println(name.contains("Mohith"));
		
		System.out.println(name.isEmpty());
		
		name.clear();
		
		System.out.println(name);
		
		
		//linkedhashset
		
		Set<Object> java = new LinkedHashSet<Object>();
		
		java.add("Mohith");
		java.add('9');
		java.add(2874628);
		java.add('9');
		java.add(null);
		java.add(null);
		
		System.out.println(java);
		
		
		Set<Object> tree = new TreeSet<Object>();
		
		tree.add("mohith");
		tree.add(714317);
		//tree.add('r');
		//tree.add(null);
		tree.add("mohith");
		//tree.add(null);
		
		System.out.println(tree);
	}

}
