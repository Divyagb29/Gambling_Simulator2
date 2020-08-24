import java.util.Random;
public class GamblingSimulator2
{
	static int stake = 100;
	static int bet = 1;
	static int stopDayLoss=50;
	static int stopDayWin=150;
	static int twentyDayloss = 0;
	static int twentyDayWin = 0;
	static int day = 0;
	public static int generateRandomNo()
	{
		Random random=new Random();
		return random.nextInt(2);
	}
	public static void getTwentyDaysOfPlay()
	{
		while(day < 20)
		{
			stake = 100;
			//per day report start
			while(stake > 50 && stake < 150)
			{
				int random = generateRandomNo();

				if(random == 0)
					stake--;

				else
					stake++;
			}
			//per day report end
			if(stake == stopDayLoss)
			{
				System.out.println("He LOST for a day"+(day+1)+" is $"+stake);
				twentyDayloss = twentyDayloss+50;
				day++;

			}
			else 
			{
				System.out.println("He win for day "+(day+1)+" is $"+stake);
				twentyDayWin = twentyDayWin+50;
				day++;
			}
		}

		System.out.println();
		System.out.println("20 days loss is $"+twentyDayloss);
		System.out.println("20 days wins is $"+twentyDayWin);
		
		if(twentyDayloss > twentyDayWin)
		{
			//to calculate 20 days loss
			twentyDayloss = twentyDayloss-twentyDayWin;
			System.out.println();
			System.out.println("overall loss in 20 days  is $"+twentyDayloss);
		}
		else
		{ 
	        //to calculate 20 days win
			twentyDayWin = twentyDayWin-twentyDayloss;
			System.out.println();
			System.out.println("overall profit in a 20 days  is $"+twentyDayWin);
		}
		
	}
	public static void main(String ag[])
	{
		  System.out.println("Welcome to GamblingSimulator Game");
		  getTwentyDaysOfPlay();
	}
}