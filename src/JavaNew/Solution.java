package JavaNew;
import java.util.Arrays;
import java.util.Scanner;

class Sport implements FootballTeam, HockeyTeam{
	int[] hockeyPlayers;
	int[]  footballPlayers;

	public Sport(int[] hockeyPlayers, int[] footballPlayers) {
		super();
		this.hockeyPlayers = hockeyPlayers;
		this.footballPlayers = footballPlayers;
	}

	public int calculateFootballScore()
	{
		int sum=0;

		for(int i=0;i<footballPlayers.length;i++)
		{
			sum=sum+footballPlayers[i];
		}
		return sum;
	}

	public int findHighestGoalByIndividualInFootball()
	{
		int sum=0;

		for(int i=0;i<footballPlayers.length;i++)
		{
			if(sum<footballPlayers[i])
			{
				sum=footballPlayers[i];
			}
		}
		return sum;
	}
	public int calculateHockeyScore()
	{
		int sum=0;

		for(int i=0;i<hockeyPlayers.length;i++)
		{
			sum=sum+hockeyPlayers[i];
		}
		return sum;
	}
	public int findHighestGoalByIndividualInHockey()
	{
		int sum=0;

		for(int i=0;i<hockeyPlayers.length;i++)
		{
			if(sum<hockeyPlayers[i])
			{
				sum=hockeyPlayers[i];
			}
		}
		return sum;
	}
}




interface FootballTeam{
	public int calculateFootballScore();

	public int findHighestGoalByIndividualInFootball();
}

interface HockeyTeam{
	public int calculateHockeyScore();
	public int findHighestGoalByIndividualInHockey();


}


public class Solution{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] hockeyPlayers = new int[11];
		int[] footballPlayers = new int[11];

		for(int i = 0; i < 11; i++)
		{
			hockeyPlayers[i] = sc.nextInt();
		}

		for(int i = 0; i < 11; i++)
		{
			footballPlayers[i] = sc.nextInt();
		}

		Sport s = new Sport(hockeyPlayers, footballPlayers);
		try{
			HockeyTeam.class.getMethod("calculateHockeyScore");
			HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
			FootballTeam.class.getMethod("calculateFootballScore");
			FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

			if(s instanceof HockeyTeam && s instanceof FootballTeam)
			{
				System.out.println(s.calculateHockeyScore());
				System.out.println(s.calculateFootballScore());
				System.out.println(s.findHighestGoalByIndividualInHockey());
				System.out.println(s.findHighestGoalByIndividualInFootball());
			}
		}
		catch (NoSuchMethodException ex)
		{
			System.out.println("No such function is exits");
		}
	}
}