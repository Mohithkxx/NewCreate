package training;

import java.util.Scanner;

public class ReverseString {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			System.out.println("The user's input " + name);
			String result = " ";
			
			for(int i=name.length()-1;i>=0;i--) {
				result=result+name.charAt(i);
			}
			System.out.println(result);
			sc.close();
	}
}