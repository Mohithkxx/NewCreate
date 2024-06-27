package training;

import java.util.Iterator;

public class ArrayA {
	
	public static void main(String[] args) {
		
		String [] ref = {"java","Selenium","Cucumber","Git"};
		
		int[] git = {10,20,30,40,50,60};
		
		System.out.println(ref[2]);
		
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
		
		int [][] batch = {{1,2,3,4,5},{6,7,8,9,10}};
		
		System.out.println(batch[1][4]);
		
	}

}
