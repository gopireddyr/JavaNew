package leetcode;

public class MouseMaze {
	static int[][] mat= {{2,1,0,0},{0,0,0,1},{0,0,0,1},{0,0,0,1}};
	static int[][] path= new int[mat.length][mat[0].length];
	
	public static void main(String[] args) {
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("\n_______\n");
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(path[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("\n_______\n");
		System.out.println(findMaze(0,0));
		
		for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[0].length;j++)
			{
				System.out.print(path[i][j]+" ");
			}
			System.out.println("");
		}
		
		
	}

	private static boolean findMaze(int i, int j) {
		
		if(i==mat.length-1 && j==mat[0].length-1)
		{
			path[i][j]=1;
			return true;
		}
		if(i<mat.length && j<mat[0].length)
		{
			path[i][j]=1;
			for(int steps=1;steps<mat[i][j]+1;steps++)
			{
				if(findMaze(i,j+steps))
				{
					return true;
				}
				if(findMaze(i+steps,j))
				{
					return true;
				}
			}
			path[i][j]=0;
		}
		return false;
		
	}

}
