package leetcode;
public interface Gopi {

	private static int sum(int a,int b)
	{
		return a+b;
		
	}
	public int sub(int a,int b);
	
	public static int mult(int a,int b) {
		System.out.println("Sum from multiple :"+sum(a,b));
		return a*b;
		
	}
}
