package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class GoodSubString {

	public static void main(String[] args) {
		int[] nums= {1,2,1,2};
		int k=2;
		int totalcount=0;
		int prevsize=0;
//		String str="";
//		ArrayList<String> setstring=new ArrayList<>();
		Set<Integer> mylist=new HashSet<>();
		 
	        int count=0;
	        for(int i=k;i<=nums.length;i++)
	        {
	        for(int j=0;j<nums.length-(i-1);j++)
	        {
	                	totalcount=getCount(j,i,nums,k,totalcount);
	                	
	        }
	        }
	        System.out.println(totalcount);
	}
	
	static int getCount(int j,int i,int[] nums,int k,int totalcount)
     {
         int count=0;
         int prevsize=0;
         Set<Integer> mylist=new HashSet<>();
         
	        for(int z=j;z<j+i;z++)
	        {
             
	           mylist.add(nums[z]);
	           if(prevsize<mylist.size())
	           {
	              count++; 
                prevsize++;
	           }
	           if(count>k)
	            {
	                break;
	            }
	        }
	        if(count==k)
         {
             totalcount++;
         }
	        return totalcount;
     }

}
