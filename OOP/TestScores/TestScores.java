public class TestScores
{
	//Fields
	public int [] scoresList;
	public int average;

	/**
		Constructor
	*/
	public TestScores(int [] scores) throws InvalidTestScores
	{
		average = validateTestScoresAverage(scores);
		scoresList = scores;
	}

	//Calculate the average test scores
	public int validateTestScoresAverage(int[] scores)
	{
		int avg = 0;
		for(int index = 0; index < scores.length; index++)
		{
			if(scores[index] < 0 || scores[index] > 100)
			{
				throw new IllegalArgumentException("Score for test " + (index+1) + " out of range");
			}
			avg += scores[index];
		}
		return( avg / scores.length );
	}

	//Get method to get the average
	public int getAverage()
	{
		return average;
	}

}