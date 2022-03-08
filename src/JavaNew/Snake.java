import java.util.*;
 public class Snake
 {
	 public static void main(String args[])
	 {
		 int i=0,j=0,counts=26;
		 char[] car= new char[26];
		 int[] count=new int[26];
		 String str="The quick brown for jumps over the lazy dog";
		 for(char a='A'; a<='Z'; a++)
		 {
			 car[i]=a;
			 count[i]=1;
			 i++;
			 
		 }
		 for(i=0;i<str.length();i++)
		 {
		 for(j=0;j<26;j++)
		 {
			 if(car[j]==str.toUpperCase().charAt(i))
			 {
				if(count[j]==1) 
				{
					count[j]=0;
					counts=counts-1;
				}
			 }
		 }
		
		 }
		           if(counts==0)
					{
						System.out.println("yes");
					}
					else
					{
						System.out.println("No");
						System.out.println(counts);
						
					}
		 
	 }
 }
 