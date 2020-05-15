public class Person
{
	//Fields
	private String personName;
	private String address;
	private String telephoneNumber;

	/**
		Constructor for Person containing all info
	*/

	public Person(String name, String add, String tele)
	{
		personName = name;
		address = add;
		telephoneNumber = tele;
	}

	/**
		Setters and Getters for all fields
	*/

	public void setPersonName(String name)
	{
		name = personName;
	}
	public String getPersonName()
	{
		return personName;
	}
	public void setAddress(String add)
	{
		add = address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setTelephoneNumber(String tele)
	{
		tele = telephoneNumber;
	}
	public String getTelephoneNumber()
	{
		return telephoneNumber;
	}
}