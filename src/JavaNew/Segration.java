package JavaNew;

public class Segration {

	public static void main(String[] args) {
		int A[]= {1,0,1,0,1,0,0,0,0};
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		int z=A.length-sum;
		System.out.println("Zeros are :"+z);
		System.out.println("one's are :"+sum);
		for(int i=0;i<A.length;i++)
		{
			if(z>0)
			{
				A[i]=0;
				z--;
			}
			else
			{
				A[i]=1;
			}
			System.out.println(A[i]);
		}

	}

}
