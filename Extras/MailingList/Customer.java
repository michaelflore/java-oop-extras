public class Customer extends Person
{
	//Fields
	private String customerNumber;
	private boolean mailingList;

	/**
		Constructor for Customer containing all info
	*/
	public Customer(String name, String add, String tele, String cusNum, boolean mailList)
	{
		super(name, add, tele);
		customerNumber = cusNum;
		mailingList = mailList;
	}
	/**
		Setters and Getters for given fields
	*/

	public void setCustomerNumber(String cusNum)
	{
		customerNumber = cusNum;
	}

	public String getCustomerNumber()
	{
		return customerNumber;
	}

	public void setMailingList(boolean mailList)
	{
		mailingList = mailList;
	}

	public boolean getMailingList()
	{
		return mailingList;
	}
}