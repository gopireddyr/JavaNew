package leetcode;

import java.util.HashMap;
import java.util.Map;

public class GoodsubstringLeet {
	public static void main(String[] args) {
		int[] nums= {1,2,1,2,3};
		int k=2;
		System.out.println(getcount(nums,k)-getcount(nums,k-1));
	}
	static int getcount(int[] nums,int k)
	{
		int Totalcount=0;
		int start=0;
		int end=0;
		Map<Integer,Integer> myMap=new HashMap<Integer,Integer>();
		while(end<nums.length)
		{
			if(myMap.containsKey(nums[end]))
				myMap.put(nums[end], myMap.get(nums[end])+1);
			else
				myMap.put(nums[end], 1);
			
			if(myMap.size()>k)
			{
				while(myMap.size()>k)
				{
					if(myMap.get(nums[start])>1)
					{
						myMap.put(nums[start], myMap.get(nums[start])-1);
					}
					else {
						myMap.remove(nums[start]);
					}
					start++;
				}
			}
			Totalcount=Totalcount+end-start+1;
			end++;
			
		}
		return Totalcount;
		
	}
	}

