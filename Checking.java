public class Checking extends Account
{
	public Checking(int accountNumber)
	{
		super(accountNumber);
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public String getAccountInfo()
	{
		return("Acct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}
