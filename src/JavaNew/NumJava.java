package JavaNew;

import java.util.Scanner;

public class NumJava {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int num=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int len=i;
			while(len<n)
			{
				sum=0;
				for(int j=len;j<n;j++)
				{
					sum=sum+arr[j];
				}
				len++;
				if(sum==0)
				{
					num=1;
					break;
				}
			}
		}
		System.out.println(num);
	}

}
