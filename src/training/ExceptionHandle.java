package training;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		
		try {
		
		int[] arr = {1,3,55,68,8};
		
		System.out.println(arr[4]);
		
		}catch(Exception e) {
			
			System.out.println(e);
			
		}finally {
			
			System.out.println("Finally block is working");
		}
		
	}

}
