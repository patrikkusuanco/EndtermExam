public class Savings extends Account
{
	private double interestRate;

	public Savings(int accountNumber, double interest)
	{
		super(accountNumber);
		setInterestRate(interest);
	}
	public void deposit (double value)
  	 {
  		   Account += Savings;

    	}

	public void setInterestRate(double interest)
	{
		interestRate = interest;
	}
	public double getInterestRate()
	{
		return interestRate;
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
		return("Account Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}
