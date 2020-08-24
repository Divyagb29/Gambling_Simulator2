import java.util.Random;
public class GamblingSimulator2
{
	static int stake = 100;
	static int bet = 1;
	public static int generateRandomNo()
	{
		Random random=new Random();
		return random.nextInt(2);
	}
	public static void main(String ag[])
	{
		  System.out.println("Welcome to GamblingSimulator Game");
	}
}