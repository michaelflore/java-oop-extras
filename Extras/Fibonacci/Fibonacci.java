public class Fibonacci
{
	//Calculate Fibonacci number but the iterative version
	public static long fibonacciIterative(long number)
	{
		if (number == 0 || number == 1)
			return number;

		long firstNumber = 0, secondNumber = 1;
		long fibNumber = 0;
		for (long series = 1; series <= number; series++)
		{
			fibNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = fibNumber;
		}
		return fibNumber;
	}
}