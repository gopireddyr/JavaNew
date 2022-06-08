package leetcode;

import java.util.Arrays;

public class FirstMissingpositiveNum {

	public static void main(String[] args) {
		int[] nums= {-1,1,3,4};
		// TODO Auto-generated method stub
		System.out.println(firstMissingPositive(nums));
	}
	 public static int firstMissingPositive(int[] nums) {
	       if(nums.length==1)
	       {
	         if(nums[0]<=0 || nums[0]>1)
	         {
	           return 1;  
	         }
	          else
	         {
	           return 2;  
	         }
	       }
	        Arrays.sort(nums);
	         for(int i=0;i<nums.length;i++)
	        {
	           if(nums[i] > 1 && i==0 )
	             {
	                  return 1;  
	             }
	             else if(nums[i] > 1 && i!=0 && nums[i-1] <=0)
	             {
	                  return 1;  
	             }
	              else if(i>0 && nums[i]-nums[i-1]>1 && nums[i-1]>0)
	             {
	                  return nums[i-1] + 1;  
	             } 
	             else if(i==nums.length-1 &&  nums[nums.length-1]<=0)
	             {
	                  return 1;  
	             } 
	        }
	        return nums[nums.length-1]+1;
	    }
}
