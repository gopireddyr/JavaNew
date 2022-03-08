package JavaNew;

import java.util.Scanner;

public class Mocktest {
	public static void main(String[] args) {
		float d= (float) 42.195;
		System.out.println(d);
		int n=5;
		float[] r=new float[n];
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			r[i]=sc.nextFloat();
		}
		MAxarr(r,d);
				
		
	}

	private static void MAxarr(float[] r, float d) {
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<r.length;j++)
			{
				if(r[i]>=d)
				{
					r[i]=0;
				}
				if(r[j]>=d)
				{
					r[j]=0;
				}
				if(r[i]<r[j])
				{
					float temp=r[i];
					r[i]=r[j];
					r[j]=temp;
				}
			}
			System.out.println(r[i]);
		}
		
	}

}
