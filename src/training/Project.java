package training;

public class Project {
	 
		
		public static void main(String[] args) {
			
			String Word = " Madam ";
			int i=0;
			int j=Word.length()-1;
			
			while(i<j) {
				
				if((Word.charAt(i) != Word.charAt(j))) {
		          
				System.out.println("Not Palindrome");
				
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
	}
	}

