package leetcode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class SubstringCounter {
	
	public static void main(String[] args) {
		String str="jbpnbwwd";
		int sunstringCount=0;
		HashSet<Character> car=new HashSet<>();
		ArrayList<Character> car1=new ArrayList<>();
		int carlength=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			car.add(ch);
			if((car.size()+carlength==i))
			{
				if(sunstringCount<car.size())
				{
					car1=(ArrayList<Character>) car.stream().collect(Collectors.toList());
				}
				sunstringCount=Math.max(car.size(), sunstringCount);
				carlength+=car.size();
				car.clear();
				--i;
				while(ch!=str.charAt(i))
				{
					--i;	
					carlength--;
				}
//				carlength=i+1;
				
			}
		}
		if(sunstringCount<car.size())
			car.stream().forEach(i->System.out.print(i));
		else
			car1.stream().forEach(i->System.out.print(i));
		sunstringCount=Math.max(car.size(), sunstringCount);
		System.out.println("\n"+sunstringCount);
		
	}

}
