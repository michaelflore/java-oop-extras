//Michael Flores
//CSC 236
//Lab 1
import java.util.Date;
public class Account
{
	//Required Fields
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

    //No argument
	public Account()
	{
		id = 0;
		balance = 0;
        annualInterestRate = 0;
    }

    //Constructor
	public Account(int ident, double bal, double annIntRate)
	{
		id = ident;
		balance = bal;
		annualInterestRate = annIntRate;
	}
	/**
		Accessor and Mutator Methods
	*/

    public void setId(int ident)
	{
		id = ident;
	}
	public int getId()
	{
		return id;
	}
	public void setBalance(double bal)
	{
		balance = bal;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setAnnualInterestRate(double annIntRate)
	{
		annualInterestRate = annIntRate;
	}
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}

    //Accessor method for the date
	public void setDateCreated(Date date)
	{
		dateCreated = date;
	}

    //Methods for the monthly interest
	public double getMonthlyInterestRate()
	{
		return annualInterestRate/12;
	}
	public double getMonthlyInterest()
	{
		return balance * getMonthlyInterestRate();
	}

	//Deposit & Withdraw methods
	public double withdraw(double amount)
	{
		return balance -= amount;
    }
	public double deposit(double amount)
	{
		return balance += amount;
	}
}