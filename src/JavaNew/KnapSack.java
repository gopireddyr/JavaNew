package JavaNew;
public class KnapSack {
	static int knapsack(int n,int price[],int weight[],int w)
	{
	        int i,j;
	        int knap[][]=new int[n+1][w+1];
	        for(i=0;i<=n;i++)
	        {
	                for(j=0;j<=w;j++)
	                {
	                        if(i==0 || j==0)
	                                knap[i][j] = 0;
	                        else
	                                knap[i][j] = Math.max(knap[i-1][j],knap[i-1][j-weight[i-1]]+price[i-1]);
	                }
	        }
	        return knap[n][w];
	}

	public static void main(String args[]){
		int[] weight= {15,30,15,14,19,1};
		int[] pr= {20,5,5,10,15,5};
		int c=60,n=6;
		System.out.println(knapsack(n,pr,weight,c));
	}
}



