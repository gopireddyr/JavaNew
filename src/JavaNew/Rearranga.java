package JavaNew;

public class Rearranga {

	public static void main(String[] args) {
		int A[]= {1,-2,30,-4,5,50,-10,-6,9,11,12,15};
		int i=0,j=A.length-1,temp;
		for(int k=i;k<j;k++)
		{
			if(A[k]<0 && A[j]>0)
			{
				j--;
				
			}
			else if(A[k]>0 && A[j]>0)
			{
				j--;
				k--;
			}
			else if(A[k]<0 && A[j]<0)
			{
				j--;
			}
			else if(A[k]>0 && A[j]<0)
			{
			 temp=A[k];
			 A[k]=A[j];
			 A[j]=temp;
			}
			
		}
		for(i=0;i<A.length;i++)
		{
			System.out.print(" "+A[i]);
		}

	}

}
