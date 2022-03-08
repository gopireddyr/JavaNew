package JavaNew;

public class MaxPrice {

	public static void main(String args[]){
		int[] weight= {2,3,4,5};
		int[] pr= {2,5,7,9};
		int c=5,n=4;
		System.out.println(price(n,weight,pr,c));
	}
	public static int price(int n,int[] weight,int pr[],int c)
	{
		int[][] total=new int[n+1][c+1];
		int taking=0;
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=c;j++)
			{
				if(i==0 || j==0)
				{
					total[i][j]=0;
				}
				else
				{
					if(j<weight[i-1])
					{
						taking=0;
					}
					else
					{
						taking=total[i-1][j-weight[i-1]];
					}
				total[i][j]=Math.max(total[i-1][j],taking+pr[i-1]);
				
				}
				System.out.print(total[i][j]+" ");
			}
			System.out.println();
		}
		return total[n][c];
	}
}

