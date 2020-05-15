public class SavingsAccount extends BankAccount
{
	//Fields
	private boolean status;

	/**
		Constructor calls superclass constructor, & determines status of account.
	*/

	public SavingsAccount(double bal, double rate)
	{
		super(bal, rate);
		if(bal<25)
			status = false;
		else
			status = true;
	}

	/**
		Methods for withdraw, deposit, monthly process, & displaying status
	*/

	public void withdraw(double amount)
	{
		if(status)
		super.withdraw(amount);
	}

	public void deposit(double amount)
	{
		if(!status)
		{
			if(amount + balance < 25)
			return;
		}
		super.deposit(amount);
	}

	public void monthlyProcess()
	{
		if(numWithdrawals > 4)
		{
			monServiceCharges += numWithdrawals -4;
		}
		super.monthlyProcess();
		if(balance < 25)
			status = false;
	}
	public void displayStatus()
	{
		System.out.println("Balance: " + balance);
		System.out.println("Charges: " + monServiceCharges);
		System.out.println("Number of Transactions " + (numDeposits + numWithdrawals));
		System.out.println();
	}
}