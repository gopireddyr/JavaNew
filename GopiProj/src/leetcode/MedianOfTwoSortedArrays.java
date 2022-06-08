package leetcode;
public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		 
		int[] nums1= {2};
		int[] nums2= {};
//		[2]
//				[]
		if((nums1.length+nums2.length)%2==0)
	       {
			System.out.print(
	          (findValue((nums1.length+nums2.length)/2 ,nums1,nums2) + findValue(((nums1.length+nums2.length)/2)+1, nums1,nums2))/2
	          );
	       }
	        else
	        {
	        	System.out.print(
	             findValue((nums1.length+nums2.length)/2 +1,nums1,nums2)
	             );
	        }

	}
	
	 static double findValue(int n,int nums1[],int[] nums2)
	    {
	        int start1=0;
	        int start2=0;
	        int value=0;
	        for(int i=0;i<n;i++)
	        {
	        	if(nums1.length-1<start1)
	        	{
	        		value=nums2[start2]; 
	            	  start2++;
	        	}
	        	else if(nums2.length-1<start2)
	        	{
	        		value=nums1[start1]; 
	            	  start1++;
	        	}
		        else if(nums1[start1]<nums2[start2])
		          {
		              value=nums1[start1];
		            	  start1++;  
		              
		              
		          }
	            else
	            {
	               value=nums2[start2]; 
		            	  start2++;
	            }
	        }
	        return value;
	    }

}
