package shape;
import java.util.Random;

public class MainShape {
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] A=new int[100];
		
		float[] B= new float[100];
		float[] C= new float[100];
		//Assigning random values to Array A with 1,2,3 values
		for(int i=0;i<100;i++)
		{
			A[i]=rand.nextInt(3)+1;
			B[i]=(float) rand.nextInt(30);
			C[i]=(float) rand.nextInt(30);
		}
		
		
		System.out.println("Answer for first question");
		System.out.println("-----------------------------------");
		System.out.println("Number         Shape          Area");
		for(int i=0;i<A.length;i++)
		{
			float area=DetermineArea(A[i] ,B[i] ,C[i]);
			ToPrint(i+1,A[i],area);
			
		}
		
		
		System.out.println("Answer for Second question with only area grater than 100");
		System.out.println("--------------------------------------");
		System.out.println("Number         Shape          Area");
		System.out.println("----------------------------------");
		for(int i=0;i<100;i++)
		{
			//Multiplying array B with 2 and calculating area at the same time
			B[i]=B[i]*2;
			float area=DetermineArea(A[i] ,B[i] ,C[i]);
			if(area>=100)
			{
				ToPrint(i+1,A[i],area);
			}
			
		}
		
	}
	
	public static float DetermineArea(int a,float b,float c )
	{
		float area = 0;
		if(a>=0 && a<=3)
		{
		
		switch (a) {
		  case 1:
			  area =(float) (3.13*b*b);
		    break;
		  case 2:
			  area =(float) (b*b);
		    break;
		  case 3:
			  area =(float) (b*c);
		    break;
			}
		
		}
		return area;
	}
	
	public static void ToPrint(int i,int a,float area)
	{
		if(a==1)
		{
			System.out.println("  "+i+"         Circle"+"          "+area);
		}
		if(a==2)
		{
			System.out.println("  "+i+"         Square"+"          "+area);
		}
		if(a==3)
		{
			System.out.println("  "+i+"         Rectangle"+"       "+area);
		}
	}

}
