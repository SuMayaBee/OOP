
public class TaxCalculator {
	double calculateTax(Account account) {
		double balance = account.getAccountBalance()/5;
		return account.getAccountBalance()*0.05;
	}
}
