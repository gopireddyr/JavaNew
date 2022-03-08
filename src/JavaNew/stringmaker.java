package JavaNew;
import java.util.Scanner;

public class stringmaker {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a=sc.next();
		String b=sc.next();
		String f="";
		while(a.length()>0 && b.length()>0)
		{
			if(a.length()>n)
			{
				f=f+a.substring(0,n);
				a=a.substring(n,a.length());
			}
			else if(a.length()<=n && a.length()>0)
			{
				f=f+a.substring(0, a.length())+b;
				b="";
				a="";
				break;
			}
			if(b.length()>n)
			{
				f=f+b.substring(0,n);
				b=b.substring(n,b.length());
			}
			else if(b.length()<=n && b.length()>0)
			{
				f=f+b.substring(0, b.length())+a;
				b="";
				a="";
				break;
			}
		}
		System.out.println(f);
	}

}
