package Lab22;

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

public class Account {

	private double balance;
    private final double MIN_BALANCE = 1000.0;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < MIN_BALANCE) {
            throw new LessBalanceException("Insufficient balance. Minimum balance should be maintained.");
        }

        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

 class UserDefinedExceptionDemo{
	
       public static void main(String[] args) {
		// TODO Auto-generated method stub
            
    	   // Create an Account with an initial balance
           Account myAccount = new Account(2000.0);

           try {
               // Try to withdraw an amount
               myAccount.withdraw(1500.0); // This should be successful
               myAccount.withdraw(600.0);  // This should throw LessBalanceException
           } catch (LessBalanceException e) {
               System.out.println("Exception caught: " + e.getMessage());
           }
	 }

}

