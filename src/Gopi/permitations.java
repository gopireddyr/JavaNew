package Gopi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class permitations {
	
	static ArrayList<String> list=new ArrayList<String>();
	static boolean rem=true;
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//Taking inputs(Str1,Str2) and converting them to lower case
		String Str1=sc.next().toLowerCase();
		String Str2=sc.next().toLowerCase();
		//validating both strings are have same length
		//if yes proceeding to permutation.
		//if not stopping program by printing false because they are not going to have same permutations already
		if(Str1.length()!=Str2.length())
		{
			System.out.println("False");
		}
		else
		{
			 int n = Str1.length();
		        char c[]=new char[n];
		        for(int i=0;i<n;i++)
		        {
		        	c[i]=Str1.charAt(i);
		        }
		        //permutations of first string store values in array list
		        permutate(c,0,n);
		       
		        for(int i=0;i<n;i++)
		        {
		        	c[i]=Str2.charAt(i);
		        }
		        //permutations of second string and same time checking whether it is exist in previous array list
		        //if it exists in previous string 
		        //if it dose not exist print false
		        removelist(c,0,n); 
		        //printing final output 
		        if(rem && list.size()==0)
		        System.out.println("True");
		        else
		        {
		        	System.out.println("False");
		        }

		}
		
	}
	private static void permutate(char[] str, int start, int end) {
		int i;
		if(start == end)
		{
			list.add(String.valueOf(str));
            
		}
		 else
	        {
	                for(i=start;i<end;i++)
	                {
	                        swap(str,start,i);
	                        permutate(str,start+1,end);
	                        swap(str,start,i);
	                }
	        }
	}
	private static void removelist(char[] str, int start, int end) {
		int i;
		if(rem) {
			if(start == end && rem)
			{
				rem =list.remove(String.valueOf(str));
	           
			}
			else
		        {
		                for(i=start;i<end;i++)
		                {
		                        swap(str,start,i);
		                        removelist(str,start+1,end);
		                        swap(str,start,i);
		                }
		        }
		}
		
		
	}
	private static void swap(char[] str,int c, int d) {
		if(c!=d && rem)
		{
			
				char temp=str[c];
				str[c]=str[d];
				str[d]=temp;
		}
		
	}

}
