package logics;

import java.util.Scanner;

public class AllStudents {
	
	public static void main(String[] args) {
		
		//Below array arr has 40 customer custom inputs to include it 
		//please uncomment below line and comment lines from 13 to 25
		//int[] arr={1,2,3,4,5,6,2,3,4,6,1,5,1,4,2,5,3,6,3,2,1,6,5,4,3,3,1,2,2,1,5,6,4,5,4,6,6,6,1,3};
		
		Scanner sc=new Scanner(System.in);
		//Taking response from user
		int[] arr=new int[40];
		for(int i=0;i<40;i++)
		{
			int response=sc.nextInt();
			//below while loop to validate customer feedback is with in 1 to 6
			while(response<1 || response>6)
			{
				System.out.println("Please enter a valid number from 1 and 6");
				response=sc.nextInt();
			}
			arr[i]=response;
		}
		
		int[] feedback=new int[6];
		//Calculating frequency of user
		for(int i=0;i<arr.length;i++)
		{
			feedback[arr[i]-1]+=1;
		}
		// Printing frequency of users
		System.out.println("Rating          Frequency");
		for(int i=0;i<6;i++)
		System.out.println("  "+(i+1)+"                 "+feedback[i]);
		
	}
			

}
