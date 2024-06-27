package training;

public class Enscapsulation {
	
   private String name = "Java class";
   
   private String word = "world";
   
   public String getWord() {
	return word;
}

public void setWord(String word) {
	this.word = word;
}
 
   public String getName() {
	return name;
   }
   
   public void setName(String name) {
	this.name = name;
   }

public static void main(String[] args) {
	
	   Enscapsulation e = new Enscapsulation();
	   
	   e.setName("Mohith");
	
	   e.getName();
	   System.out.println(e.getName());
	   
	   e.setWord("Earth");
	   System.out.println(e.getWord());
}
	
}
