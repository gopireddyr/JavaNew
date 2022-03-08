package JavaNew;
public class Flipcards 
{
	static int MaximumMarks(int m,int[] p,int n)
	{ 
		int[] card =new int[100];
		int i,j;
		int[] temp =new int[100];
		/*int sum=1;
		for(i=0;i < m;i++)
		{
			sum=sum*p[i];
		}
		return (n-1)*sum + 1;*/
		int count=0;
		for(i=0;i<100;i++)
		{
			card[i]=i+1;
		}
		for(i=0;i<m;i++)
		{
		int sum=0;
            for(j=0;j<p[i];j++)
			{
			    count=j%p[i];
			    while(count < 100)
				{					
//					if(sum >= 100)
//					{
//						break;
//					}
					temp[sum]=card[count];
					count=count+p[i];
					sum++;					
				}
			}
			
			for(int z=0;z<100;z++)
			{
				card[z]=temp[z];
				System.out.print(" "+card[z]);
			}
			System.out.println(" ======= ");
		}
		
		return card[n-1];
	}
	 public static void main (String[] args)  
    {
        int m=2, n=4;
		int[] p = {10,10};
        System.out.println(MaximumMarks(m,p,n)); 
    }
}
