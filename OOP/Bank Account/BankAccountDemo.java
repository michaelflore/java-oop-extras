public class BankAccountDemo
{
	public static void main(String [] args)
	{
		//Set balance and rate variables to desired amount
		double bal = 10000;
		double rate = 12;

		//Create savings account object.
		SavingsAccount object = new SavingsAccount(bal, rate);

		//Loop for displaying information
		for(int index = 0; index < 5; index++)
		{
			double dep = (Math.random()*100);
			object.deposit(dep);
			object.displayStatus();

			double with = (Math.random()*100);
			object.withdraw(with);
			object.displayStatus();
		}
	}
}