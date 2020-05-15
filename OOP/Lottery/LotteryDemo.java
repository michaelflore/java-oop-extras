import java.util.Scanner;                        //Needed for Scanner object
import java.util.Arrays;                         //Needed for Array to String method

public class LotteryDemo
{
	public static void main(String [] args)
	{
		//Constructor
		Lottery lottery = new Lottery();
		int winningNumbers = lottery.getLotteryNumbers().length;

		System.out.println("Welcome to Lottery Application Game!\n");
		System.out.println("There are 5 special numbers ranging from 0-9! Can you guess them?");

        //Scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		int [] numbers = new int [5];

		System.out.println("Enter your 5 lucky numbers");

		for( int index = 0; index < numbers.length; index++ )
		{
			numbers[index] = keyboard.nextInt();
		}

        //Display and compare the the users numbers to the random number generator
		int match = lottery.compareNumbers( numbers );
		if( match == winningNumbers )
		{
			System.out.println("WOW! YOU ARE THE GRAND WINNER!");
		}
		else
		{
			System.out.println("Sorry you are not the winner.\n" + "The winning numbers are " + Arrays.toString(lottery.getLotteryNumbers()) + ".");
		}
	}
}