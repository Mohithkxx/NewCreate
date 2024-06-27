package training;

public class Exceptionexample {
	
	
	public static void main(String[] args) {
		
	try {
		
	int a = 13/0;
	System.out.println(a);
	}catch(ArithmeticException ec) {
		System.out.println(ec);
	}catch(ArrayIndexOutOfBoundsException rt) {
		System.out.println(rt);
	}finally {
		System.out.println("The text enter the finally block");
	}
	
	}
}
