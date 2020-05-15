import java.util.Scanner;						//Needed for Scanner class
public class TestScoresDemo
{
	public static void main(String [] args)
	{
		//Array to hold test scores
		int [] scoresArray = getArray(getInput("Scores for test:\nHow many tests are there?"));

		//Display avg test scores and alert user if input is invalid
		try
		{
			TestScores object = new TestScores(scoresArray);
			System.out.println("\nAverage Scores:" + object.getAverage());
		}
		catch(InvalidTestScores e)
		{
			System.out.println(e);
		}
	}

	//Get the scores from the user
	public static int [] getArray(int array)
	{
		int [] scores = new int[array];
		for(int index = 0; index < scores.length; index++)
		{
			scores[index] = getInput("Enter score for test #" + (index+1));
		}
		return scores;
	}

   //Method that passes string and gets input from the user
	public static int getInput(String str)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println(str);
		return keyboard.nextInt();
	}
}