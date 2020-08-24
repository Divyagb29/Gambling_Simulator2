import java.util.Random;
public class GamblingSimulator2
{
	static int stake = 100;
	static int bet = 1;
	static int stopDayLoss=50;
	static int stopDayWin=150;
	static int monthLoss = 0;
	static int monthWin = 0;
	static int overallMonthWin=0;
	static int overallMonthLoss=0;
	static int day = 1;
	static int luckyDay = 0;
	static int unluckyDay = 0;
	static int luckyUnluckyDay = 0;
	public static int generateRandomNo()
	{
		Random random=new Random();
		return random.nextInt(2);
	}
	public static void getMonthofDaysPlay()
	{
		
		int month=1;
		do {
			int arr[]=new int[30];
            day = 1;
            monthLoss = 0;
            monthWin = 0;
			overallMonthWin=0;
			overallMonthLoss=0;
			luckyDay = 0;
			unluckyDay = 0;
			luckyUnluckyDay = 0;
			System.out.println();
			System.out.println();
			System.out.println("MONTH NO "+month+" DATA");
			System.out.println("*************************************");

			while(day <= 30)
			{
				stake = 100;
				while(stake > 50 && stake < 150)//per day report start
				{
					int random = generateRandomNo();

					if(random == 0) 
					{
						stake--;
					}
					else
					{
						stake++;
					}
				}
				//per day report end
				if(stake == stopDayLoss)
				{
					System.out.println("day "+day+" He LOST--->$"+50);
					monthLoss = monthLoss+50;
					luckyUnluckyDay = luckyUnluckyDay-50;
					arr[day-1] = luckyUnluckyDay;
				}
				else 
				{
					System.out.println("day "+day+" He WON---->$"+50);
					monthWin = monthWin+50;
					luckyUnluckyDay = luckyUnluckyDay+50;
					arr[day-1] = luckyUnluckyDay;
				}
				day++;
			}

			System.out.println("month loss is $"+monthLoss);
			System.out.println("month wins is $"+monthWin);
			if(monthLoss > monthWin)//to calculate 30 days loss
			{
				overallMonthLoss = monthLoss-monthWin;
				System.out.println("overall loss in a month  is $"+overallMonthLoss);
			}

			else
			{
				//to calculate 30 days win
				overallMonthWin = monthWin-monthLoss;
				System.out.println("overall profit in a month  is $"+overallMonthWin);
			}
			getLuckyUnluckyDay(arr);
			month++;
		}
		while(monthWin > monthLoss);
	}
	public static void getLuckyUnluckyDay(int arr[])
	{
		int high = arr[0];
		int low = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(high < arr[i])
			{
				high = arr[i];
				luckyDay = i+1;
			}
			if(low > arr[i])
			{
				low = arr[i];
				unluckyDay = i+1;
			}
		}
		System.out.println("lucky day was day "+luckyDay+" he was in $"+high);
		System.out.println("Unlucky day was day "+unluckyDay+" he was in $"+low);

	}
	public static void main(String ag[])
	{
		  System.out.println("Welcome to GamblingSimulator Game");
		  System.out.println("********************************************");
		  System.out.println("Gambler is starting bet from $100 everyday");
		  System.out.println("********************************************");
		 // getTwentyDaysOfPlay();
		  getMonthofDaysPlay();
	}
}