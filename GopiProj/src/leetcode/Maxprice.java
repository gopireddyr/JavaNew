package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maxprice {

	public static void main(String[] args) {
		int[] prices= {3,3,5,0,0,3,1,4};
		int[] leftMax =new int[prices.length];
        int min = prices[0];
        //
        
        //
        for(int i = 1;i< prices.length; i++){
            min = Math.min(min, prices[i]);
            leftMax[i] = Math.max(leftMax[i-1], prices[i] - min);
        }
        
        int[] rightMax = new int[prices.length];
        int max = prices[prices.length - 1];
      
        for(int i=prices.length -2; i >= 0 ;i-- ){
            max = Math.max(max, prices[i]); 
            rightMax[i] = Math.max(rightMax[i+1], max - prices[i]);
        }
        
        int profit = rightMax[0];
        
        for(int i=1;i<prices.length;i++)
            profit = Math.max(profit, leftMax[i-1]+rightMax[i]);
        
        System.out.println(profit);
	}

}
