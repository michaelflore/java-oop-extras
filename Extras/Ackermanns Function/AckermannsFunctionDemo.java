public class AckermannsFunctionDemo
{
	public static void main(String [] args)
	{
		//Create a AckermannsFunction object and assign it to variable
		AckermannsFunction function = new AckermannsFunction();

		//Test out ackermann method with given numbers
		System.out.println(function.ackermann(0, 0) + "\n");

		System.out.println(function.ackermann(0, 1) + "\n");

		System.out.println(function.ackermann(1, 1) + "\n");

		System.out.println(function.ackermann(1, 2) + "\n");

		System.out.println(function.ackermann(1, 3) + "\n");

	    System.out.println(function.ackermann(2, 2) + "\n");

		System.out.println(function.ackermann(3, 2) + "\n");

	}
}