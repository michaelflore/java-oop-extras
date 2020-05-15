//Michael Flores
//CSC 236
//Lab 1
public class Conversion
{
	//Recursive method
	public static int hex2Dec(String hexString)
	{
		String hexNumbers = "0123456789ABCDEF";
		int decimal = 0;


		hexString = hexString.toUpperCase();
		int length = hexString.length();

		if (length > 0)
		{
			char character = hexString.charAt(0);
			int digit = hexNumbers.indexOf(character);
			String substring = hexString.substring(1);

			decimal = digit * (int) Math.pow(16, length - 1) + hex2Dec(substring);
		}
    //Return Hex string as decimal
	return decimal;
	}
}