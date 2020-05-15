public class InvalidTestScores extends Exception
{
	/**
		Constructor
	*/
	public InvalidTestScores()
	{
		super("Error: Test score out of range");
	}
	/**
		Constructor
	*/
	public InvalidTestScores(int invalid)
	{
		super("Error: Test score out of range" + invalid);
	}
}