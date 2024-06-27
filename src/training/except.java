package training;

import java.util.Scanner;

public class except {
	
	public static void main(String[] args) {
		
		try {
			
			int[] number = {1,2,3,4};
			System.out.println(number[1]);
		}catch(ArithmeticException e) {
			System.out.println("hi");
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("hello");
			System.out.println(e);
		}
		
		finally {
			System.out.println("The try and catch block is finished");
		}
		
		String s=null;  
		System.out.println(s.length()); //nullpointer exception
		
		
//			Scanner sc = new Scanner(System.in);
//			System.out.println("your age is : ");
//			int age = sc.nextInt();
//			
//			if (age<=23) {
//				System.out.println("good");
//			}
			

	}}
