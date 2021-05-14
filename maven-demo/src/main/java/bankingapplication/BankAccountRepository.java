package bankingapplication;

public interface BankAccountRepository {
	
	public double getBalane(long accountId);
	public double updateBalance(long accountId, double newBalance);
	

}
