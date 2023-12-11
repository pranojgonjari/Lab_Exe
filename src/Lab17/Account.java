package Lab17;

public class Account {

	 private int accountId;
	    private String accountName;
	    private double balance;

	    // Constructor for Account class
	    public Account(int accountId, String accountName, double balance) {
	        this.accountId = accountId;
	        this.accountName = accountName;
	        this.balance = balance;
}
	 // Inner class Locker
	    class Locker {
	        private int locId;

	        // Constructor for Locker class
	        public Locker(int locId) {
	            this.locId = locId;
	        }

	        // Method to print Account information inside Locker class
	        public void printAccountInfo() {
	            System.out.println("Account ID: " + accountId);
	            System.out.println("Account Name: " + accountName);
	            System.out.println("Balance: $" + balance);
	        }
	    }

	    // Method to display Account information
	    public void displayAccountInfo() {
	        System.out.println("Account ID: " + accountId);
	        System.out.println("Account Name: " + accountName);
	        System.out.println("Balance: $" + balance);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an instance of the Account class
        Account myAccount = new Account(123456, "John Doe", 1000.0);

        // Create an instance of the inner class Locker
        Account.Locker myLocker = myAccount.new Locker(987);

        // Display Account information using the displayAccountInfo method
        System.out.println("Account Information:");
        myAccount.displayAccountInfo();

        System.out.println("\nLocker Information:");
        // Print Account information inside Locker
        myLocker.printAccountInfo();

	}

}
