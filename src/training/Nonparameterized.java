package training;

public class Nonparameterized {

	int a;
	String w;
	
	public Nonparameterized() {
		a=12;
		w="string";
	}
	
	public static void main(String[] args) {
		
		Nonparameterized np = new Nonparameterized();
		System.out.println(np.a);
		System.out.println(np.w);
	}
}
