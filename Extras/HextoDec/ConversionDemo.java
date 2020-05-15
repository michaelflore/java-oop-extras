//Needed for Scanner class
import java.util.Scanner;
public class ConversionDemo
{
	public static void main(String [] args)
	{
		String input;
		Scanner keyboard = new Scanner(System.in);

        //Ask user to enter a value
		System.out.println("Enter a Hex Value:");
        input = keyboard.nextLine();

		System.out.println("Converted from Hex to Decimal:" + Conversion.hex2Dec(input));

	}
}