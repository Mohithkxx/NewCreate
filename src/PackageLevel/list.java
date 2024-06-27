package PackageLevel;

import java.util.ArrayList;
import java.util.List;

public class list {
	
	public static void main(String[] args) {
		
		
	List<Object> words = new ArrayList<Object>();
	
	//ArrayList<Object> www = new ArrayList<Object>();   fully based on classes 
	
	words.add("List"); //add method
	words.add(100);
	words.add(true);
	words.add('s');
	
	System.out.println(words);
	
	//add method with index
	
	words.add(2, "java");
	
	System.out.println(words);
	
	words.get(3);
	
	//get method with index
	
	System.out.println(words.get(3));
	
	//set 
	
	words.set(2, "words");
	
	System.out.println(words);
	
	//remove
	
	words.remove(3);
	
	System.out.println(words);
	
	//size
	
	System.out.println(words.size());
	
	//Contains - boolean
	
	System.out.println(words.contains("List"));
	
	//isEmpty
	
	System.out.println(words.isEmpty());
	
	//clear
	
	words.clear();
	System.out.println(words);
	
	
	}
	
}
