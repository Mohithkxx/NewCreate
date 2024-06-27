package training;

public class ThrowandThrows {
	
	public static void checkage(int age) {
		
		if(age < 18) {
			
			throw new ArithmeticException("Access denied - you must be atleast 18");
		}else {
			System.out.println("You are granted to vote");
		}
		
	}
	
	public static void main(String[] args) {
		
		checkage(12);
	}

}
