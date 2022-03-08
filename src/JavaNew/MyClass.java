package JavaNew;
import java.util.*;

public class MyClass {
public static void main(String[] args) {
	int i,j,sum=0;
	
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		sum=sum+a[i];
	}
	for(i=0;i<=n;i++)
	{
		if(i!=0)
		{
			sum=sum-a[i-1];
			System.out.print(sum+" ");
		}
	}
	
	
	
}
}
