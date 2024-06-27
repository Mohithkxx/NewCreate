package training;

public class InterfaceChild implements Interface{
	
	public void m1() {
		
		System.out.println("hi");
	}
	
	public void m2() {
		
		System.out.println("hello");
	}
	
	public static void main(String[] args) {
		
		InterfaceChild ic = new InterfaceChild();
		
		ic.m1();
		ic.m2();
	}

}
