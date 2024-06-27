package training;

public class Constructors {

	int number;
	String word;
	
	public Constructors(int n,String w) {
		number = n;
		word = w;
	}
	
	public static void main(String[] args) {
		
		Constructors c = new Constructors(15, "hello java");
		System.out.println(c.number);
		System.out.println(c.word);
	}
}
