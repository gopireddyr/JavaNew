package JavaNew;
import java.util.Scanner;
public class Stocks {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,j,buy=0,sum=0;
		int[] a=new int[7];
		for(i=0;i<7;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<6;i++)
		{
			if(a[i]<a[i+1] && buy<=0)
			{
				buy=a[i];
			}
			if(a[i]>a[i+1] && buy>0)
			{
				sum=sum+a[i]-buy;
				buy=0;
			}
			
		}
		if(i==6 && buy>0)
		{
			sum=sum+a[i]-buy;
			System.out.print(sum);
		}
		else
			System.out.print(sum);
		
	}

}
