class Account {
	int accountNumber;
	private double accountBalance;
	public void deposit(double amount) {
		if (amount > 0) 
			accountBalance = accountBalance + amount;
		checkAccountBalance();
	}
	public void withdraw(double amount) {
		if (amount <= accountBalance) 
			accountBalance = accountBalance - amount;
		checkAccountBalance();
	}
	double getAccountBalance()
	{
		return accountBalance;
	}
	private void checkAccountBalance()
	{
		System.out.println("Current balance: "+ accountBalance);
	}
}
