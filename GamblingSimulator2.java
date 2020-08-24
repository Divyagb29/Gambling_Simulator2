import java.util.Random;
public class GamblingSimulator2
{
	static int stake = 100;
	static int bet = 1;
	static int stopDayLoss=50;
	static int stopDayWin=150;
	static int monthLoss = 0;
	static int monthWin = 0;
	static int day = 0;
	public static int generateRandomNo()
	{
		Random random=new Random();
		return random.nextInt(2);
	}
	public static void getMonthofDaysPlay()
	{
		while(day < 30)
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

		System.out.println("month loss is $"+monthLoss);
		System.out.println("month wins is $"+monthWin);
		if(monthLoss > monthWin)//to calculate 30 days loss
		{
			monthLoss = monthLoss-monthWin;
			System.out.println();
			System.out.println("overall loss in a month  is $"+monthLoss);
		}

		else {
			//to calculate 30 days win
			monthWin = monthWin-monthLoss;
			System.out.println();
			System.out.println("overall profit in a month  is $"+monthWin);
		}
		
	}
	public static void main(String ag[])
	{
		  System.out.println("Welcome to GamblingSimulator Game");
		 // getTwentyDaysOfPlay();
		  getMonthofDaysPlay()
	}
}