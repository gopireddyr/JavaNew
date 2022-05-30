package TCSEXAM;

public class Radiation {

	public static void main(String[] args) {
		
		int a[] ={6,12,6,2};
		int b[]={2,12};
		radiation(7,13,5,a,5,b);
	}
	public static void radiation(int n,int m,int r,int[] cordr,int t,int[] cordm ){
		int [][] a=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=1;
			}
		}
		
		for(int i=0;i<r;i++)
		{
			a[cordr[i]][cordr[i+1]]=0;
		}
		a[cordm[0]][cordm[0]]=9;
		
		//Calculating man speed
		
		
	}
	
}
