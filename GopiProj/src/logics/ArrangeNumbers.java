package logics;

public class ArrangeNumbers {
	
	public static void main(String[] args)
	{
		int a[]= {-11,1,-1,3,2,-7,-5,11,6,-10,-10,-11};
		int end=a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]<0)
			{
				for(int j=i;j<end;j++)
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}	
				end--;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
