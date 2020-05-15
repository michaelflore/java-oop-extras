import java.util.Scanner;				//Needed for Scanner class

public class FibonacciDemo
{
	public static void main(String [] args)
	{
		//Create Scanner object for input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a positive Integer");
		int number = keyboard.nextInt();

		long currentTime = System.currentTimeMillis();
		long previousTime;
		long elapsedTime = 0;

		for(int i = 0; i <= 5; i++)
		{
			previousTime = currentTime;
			System.out.println("The Fibonacci term at position");
			System.out.println((number + i) + " is");

			System.out.println(Fibonacci.fibonacciIterative(number + i));

			currentTime = System.currentTimeMillis();

			elapsedTime = (currentTime - previousTime)/1000;
			System.out.println("Computed in " + elapsedTime + " seconds.");
			System.out.println("Computer in " + (currentTime-previousTime)+ " milliseconds.");
		}
	}
}


