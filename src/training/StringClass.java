package training;

public class StringClass {
	
	public static void main(String[] args) {
		String letter = "  ";
		String number = "Java class";
		System.out.println(letter);
		
		System.out.println(number);
	
		//1.length
		
		System.out.println(letter.length());
		
		//2.equals
		
		System.out.println(letter.equals(number));  //boolean
		
		//3.Uppercase
		
		System.out.println(letter.toUpperCase());
		
		//4.Lowercase
		
		System.out.println(letter.toLowerCase());
		
		//5.CharAt
		
		//System.out.println(letter.charAt(6)); //index based
		
		//6.index of
		
		System.out.println(letter.indexOf('C')); //index based
		
		//7.last index of
		
		System.out.println(letter.indexOf('s'));
		
		System.out.println(letter.lastIndexOf('s'));
		
		//8.contains
		
		System.out.println(letter.contains("s")); //boolean
		
		//9.Startswith
		
		System.out.println(letter.startsWith("JaVa")); //boolean
		
		//10.endswith
		
		System.out.println(letter.endsWith("ClAss")); // boolean
		
		//11.trim
		
		System.out.println(letter.length());
		
		System.out.println(letter.trim().length());
		
		//12.replace
		
		System.out.println(letter.replace('J', 'M')); //char
		
		//13.concatination
		
		System.out.println(letter.concat(number));
		
		//14.isempty
		
		System.out.println(letter.isEmpty()); //boolean
		
		
		//15.EqualIgnoreCase
		
		String s = "Java CLASS";
		String s1 = "JAVA class";
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		
		//16. Sub - String
		
		String word = "javaclass";  //index
		
		System.out.println(word.substring(2, 8));
		
		

	}
}
