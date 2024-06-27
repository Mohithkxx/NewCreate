package training;

public class Nested {
	
	public static void main(String[] args) {
		
		    int weeks = 3;
		    int days = 7;

		    // outer loop prints weeks
		    for (int i = 1; i <= weeks; ++i) {
		      System.out.println("Week: " + i);

		      // inner loop prints days
		      for (int j = 1; j <= days; ++j) {          //1 <= 7 // condition is true 
		    	  
		        System.out.println("  Day: " + j);        //2 <= 7 // condition is true
		      }
		    } 
		  }
	}


