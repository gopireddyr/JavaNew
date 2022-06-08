package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class validprod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calculatePossibleCombinations("12211221"));
	}
	public static long calculatePossibleCombinations(String inputStr) {
		if(inputStr.length()<2)
		{
			return 1;
		}
		char[] car=inputStr.toCharArray();
		System.out.println(inputStr);
		ArrayList<Integer> mylist=new ArrayList<>();
		
		for(int i=0;i<car.length;i++)
		{
			if(Character.getNumericValue(car[i])==0)
			{
				mylist.add(mylist.get(mylist.size()-1)*10);
				mylist.remove((mylist.size()-2));
			}
			else
			{
				mylist.add(Character.getNumericValue(car[i]));
			}
		}
		int count=0;
		for(int i=0;i<mylist.size()-1;i++)
		{
			int a=mylist.get(i);
			int b=mylist.get(i+1);
			if((a*10+b>a && a*10+b>b) && (a*10+b)<=26)
			{
				count++;
			}
		}
		int ocounr=0;
		for(int i=0;i<mylist.size()-1;i++)
		{
			int a=mylist.get(i);
			int b=mylist.get(i+1);
			if((a*10+b>a && a*10+b>b) && (a*10+b)<=26)
			{
				ocounr++; 
				i=i+1;
			}
		}
		int sum=0;
		for(int i=2;i<=ocounr;i++)
		{
			sum=sum+getfactorial(ocounr)/(getfactorial(ocounr-i)*getfactorial(i));
		}
		return count+1+sum;
	}
	private static int getfactorial(int num) {
		int prod=1;
		for(int i=2;i<=num;i++)
		{
			prod=prod*i;
		}
		return prod;
	}

}
