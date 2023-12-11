package Lab23;

public class Account {

	private double balance;
    private final double MIN_BALANCE = 1000.0;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        // Assertion to check if the balance is sufficient
        assert balance - amount >= MIN_BALANCE : "Insufficient balance. Minimum balance should be maintained.";

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Create an Account with an initial balance
        Account myAccount = new Account(2000.0);

        // Try to withdraw an amount
        myAccount.withdraw(1500.0);
	}

}
