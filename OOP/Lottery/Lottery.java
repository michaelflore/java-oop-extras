import java.util.*;                       // Needed for random object

public class Lottery
{
	//An array of 5 integers named lotteryNumbers
    int [] lotteryNumbers = new int[5];

    //Random number constructor
	public Lottery()
	{
		Random rand = new Random();
		for( int index = 0; index < lotteryNumbers.length; index++ )
	    {
			lotteryNumbers[index] = rand.nextInt(9);
	    }
	}

    //A method that compares user numbers to lottery numbers.
	public int compareNumbers( int [] usersNumbers )
	{
		int match = 0;
		if( usersNumbers.length == lotteryNumbers.length )
	    {
			for( int index = 0; index < lotteryNumbers.length; index++ )
		    {
				if ( usersNumbers[index] == lotteryNumbers[index])
			    {
					match++;
			    }
		    }
        }
	    return match;
    }

    //Method in order to display the numbers for user.
    public int[] getLotteryNumbers()
    {
		return lotteryNumbers;
	}
}
