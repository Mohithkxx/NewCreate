package training;

public class MethodOverloading {
	
	public void Method1() {
		
		System.out.println("Hello java");
		
	}
	
	public static void Method1(int a,int b) {
		
		System.out.println(a + b);
	}
	
	public static void Method1(char a,int c) {
		
		System.out.println("This method has char and int datatype");
		System.out.println(a + c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		
		m.Method1();
		Method1(10, 7);
		Method1('Z', 67);
		
	}

}
