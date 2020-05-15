public abstract class BankAccount
{
	//Fields
	public double balance = 0;
	public double numDeposits = 0;
	public double numWithdrawals = 0;
	public double annInterestRate = 0;
	public double monServiceCharges = 0;

	/**
		Constructor sets the balance & annual interest rate.
	*/

	public BankAccount(double bal, double rate)
	{
		balance = bal;
		annInterestRate = rate;
	}

    /**
    	Methods for deposit, withdraw, calculating interest, & monthly process.
    */

	public void deposit(double amount)
	{
		balance += amount;
		numDeposits++;
	}

	public void withdraw(double amount)
	{
		balance -= amount;
		numWithdrawals++;
	}

	public void calcInterest()
	{
		double monthlyInterestRate = (annInterestRate/12);
		double monthlyInterest = balance * monthlyInterestRate;
		balance += monthlyInterest;
	}

	public void monthlyProcess()
	{
		balance -= monServiceCharges;
		calcInterest();
		numWithdrawals = 0;
		numDeposits = 0;
		monServiceCharges = 0;
	}
}