package newpack;

public class copte {

	public static void main(String[] args) {
		int n1=3,n2=12,max;
		max=(n1>n2)?n1:n2;
		while(true)
		{
			if(max%n1==0 && max%n2==0)
			{
				System.out.println(max);
				break;
			}
			++max;
		}
	}

}
