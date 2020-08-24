import java.util.Random;
public class GamblingSimulator2
{
	static int stake = 100;
	static int bet = 1;
	static int stopDayLoss=50;
	static int stopDayWin=150;
	public static int generateRandomNo()
	{
		Random random=new Random();
		return random.nextInt(2);
	}
	public static void resignOfTheDay()
	{

		while(stake > 50 && stake < 150)
		{
			int random=generateRandomNo();

			if(random == 0)
			{
				stake--;
			}
			else
			{
				stake++;
			}
		}
		if(stake == stopOfDayLoss)
		{
			System.out.println("He LOST for a day----> $"+stake);
		}
		else
		{
			System.out.println("He WON for the day----> $"+(stake-100));
		}
	}
	public static void main(String ag[])
	{
		  System.out.println("Welcome to GamblingSimulator Game");
		  resignOfTheDay();
	}
}