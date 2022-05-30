package collectionpack;

import java.util.HashSet;

public class Hashsetmainclass {
	
	public static void main(String[] args) {
		HashSet<Hashsetexample> set1=new HashSet<>();
		Hashsetexample[] set=new Hashsetexample[6];
		set[0]=new Hashsetexample("Gopi","Reddy",10);
		set[1]=new Hashsetexample("Reddy","Gopi",11);
		set[2]=new Hashsetexample("Gopi","Reddy",10);
		set[3]=new Hashsetexample("Gopi","Reddy",10);
		set[4]=new Hashsetexample("Gopi","Reddy",10);
		set[5]=new Hashsetexample("Gopi","krishna",10);
		
		for(int i=0;i<set.length;i++)
		{
			set1.add(set[i]);
		}
		for(Hashsetexample e : set1)
		{
			System.out.println(e);
//			System.out.println(e.First_Name+" "+e.Last_Name+" "+e.age);
		}
		
//		Iterator itr=set1.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println();
//		}
		
	}

}
