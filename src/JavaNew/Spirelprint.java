package JavaNew;

import java.util.*;

public class Spirelprint {
	static int row=0;
public static void main(String[] args) {
	int[][] a= {
			{1,2,3,4},
			{4,5,6,5},
			{7,8,9,6},
			{1,2,3,7},};
	Spirel(a,0,a[0].length);
	
}

private static void Spirel(int[][] a,int start,int end) {
	
	
		if(start>end)
		{
			
		}
		else
		{
			for(int i=start; i<a[0].length-start; i++)
			{
				System.out.print(a[start][i]+" ");
				
			}
			System.out.println();
			for(int i=start+1; i<a.length-start; i++)
			{
				System.out.print(a[i][a[0].length-start-1]+" ");
			}
			System.out.println();
			for(int i=a[0].length-start-2; i>=start; i--)
			{
				System.out.print(a[a.length-start-1][i]+" ");
			}
			System.out.println();
			for(int i=a.length-start-2; i>=start+1; i--)
			{
				System.out.print(a[i][start]+" ");
			}
			System.out.println();
			start=start+1;
			end=end-1;
			Spirel(a,start,end);
		}
		
		
	
}
}
