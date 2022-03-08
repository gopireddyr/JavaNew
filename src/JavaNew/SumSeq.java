package JavaNew;

import java.util.Scanner;

public class SumSeq {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,n,sum=0,temp=0;
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				sum=sum+a[i];
			}
			if(a[i]>a[i+1] && sum>0)
			{
				sum=sum+a[i];
				if(temp<sum)
				{
					temp=sum;
				}
				
				sum=0;
			}
		}
		if(i==n-1 && sum>0)
		{
			sum=sum+a[n-1];
		}
		if(sum<temp)
		{
			System.out.print(temp);
		}
		else
			System.out.print(sum);
		
		
	}


}
