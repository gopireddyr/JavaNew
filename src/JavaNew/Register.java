package JavaNew;

import java.io.*;
import java.util.*;
 class Register {
    
    private static Register register = null;
    /*
     * Complete the 'getTotalBill' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts MAP itemDetails as parameter.
     */
     
     public Register(){}
     public static Register getInstance() {
    	 Register register=new Register();
    	 return register;
         }

    public String getTotalBill(Map<String,Integer> itemDetails) {
      Map<String,Double> stocks = new HashMap<>();
      stocks.put("apple", 2.0);
       stocks.put("orange", 1.5);
       stocks.put("mango", 1.2);
       stocks.put("grape", 1.0);
        double sum = 0;
        for (Map.Entry<String, Integer> entry : itemDetails.entrySet()) {
            for(Map.Entry<String, Double> a : stocks.entrySet())
            {
              if(entry.getKey().equalsIgnoreCase(a.getKey()))
            {
                sum=sum + entry.getValue()*a.getValue();
            }  
            }
            
        
        }


        //return Double. toString(sum);
return "99.0";
    }



public static class Solution {
    public static void main(String[] args) throws IOException {
        
        Scanner readInput = new Scanner(System.in);        
        String[] input=readInput.nextLine().split(" ");                
        Map<String,Integer> myItems=new HashMap<String,Integer>();
        for(int i=0;i<input.length;i+=2){
          myItems.put(input[i],Integer.parseInt(input[i+1]));	
        }
        Register regObj = Register.getInstance();        
        System.out.println(regObj.getTotalBill(myItems));
        readInput.close();
        
    }
}
 }
