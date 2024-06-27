package training;

public class Try {
	
	public static void main(String[] args) {
		
		 double balance = 500.0;
	        double amountToTransfer = 600.0;
	        String recipientAccount = "1234567890";

	        // Attempt to transfer money without exception handling
	        if (balance >= amountToTransfer) {
	            // Simulate the transfer
	            balance -= amountToTransfer;
	            System.out.println("Transfer successful. New balance: " + balance);
	        } else {
	            // Terminate the program abruptly
	            System.out.println("Insufficient funds.");
	        }
	}

}
