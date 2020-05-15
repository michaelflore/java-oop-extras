import java.util.Scanner;            //Needed for Scanner class
public class CustomerDemo
{
	public static void main(String [] args)
	{
		String input;

		//Create Scanner object
		Scanner keyboard = new Scanner(System.in);
		//Create Customer object
		Customer customer = new Customer("Richard Plodzien", "66 Timberland Road", "908-619-4200", "1", true);

		//Ask user for input
		System.out.println("Would you like to join our mailing list?(Enter Yes or No)");
		input = keyboard.nextLine();

		//Display all information
		if(input.equalsIgnoreCase("Yes"))
		{
			System.out.println("Name:" + customer.getPersonName() + "\nAddress:" + customer.getAddress() +
						   "\nTelephone#:" + customer.getTelephoneNumber() + "\nCustomer number:" + customer.getCustomerNumber());
		}
		else
		{
			System.out.println("We are always here if you change your mind!");
		}
	}
}