package JavaNew;

import java.util.Scanner;

public class AsciiValue {
	public static void main(String args[])
	{
		int a;
		char c;
		String s;
		Scanner sc=new Scanner(System.in);
		
		s=sc.nextLine();
		a=sc.nextInt();
		c=sc.next().charAt(0);
		
		int ascii=(int) 'A';
		System.out.println(ascii);	
		System.out.println("integer is : "+a+"Char is : "+c+"String is :"+s);	
	}
	

}
