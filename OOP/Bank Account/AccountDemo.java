public class AccountDemo
{
	public static void main(String [] args)
	{
		//Create an Account object
		Account accountObject = new Account(1122, 20000, .045);

		java.util.Date dateCreated = new java.util.Date();

        //Methods for deposit and withdraw
		accountObject.withdraw(2500);
		accountObject.deposit(3000);

        //Display information
		System.out.println("ID:" + accountObject.getId()+ "\nAnnual Interest Rate:" + accountObject.getAnnualInterestRate());

		System.out.println("Account New Balance:" + accountObject.getBalance() +
		                   "\nMonthly Interest:" + accountObject.getMonthlyInterestRate() +
		                   "\nDate Created:" + dateCreated);
	}
}