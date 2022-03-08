package JavaNew;

import java.util.Scanner;

public class Chiper {
    
    public static void main(String[] args){
        Scanner readInput = new Scanner(System.in);
        String normal=readInput.nextLine();
        String ciphered=readInput.nextLine();
        System.out.println(ciphering(normal));
        System.out.println(deciphering(ciphered));
    }
    
    public static String ciphering(String normal){
        String str=normal;
        int len=str.length(),sum=0;
        char[] c = new char[len];
        for(int i=len-1;i>=0;i--)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
              c[sum]= Character.toLowerCase(str.charAt(i));
              sum++;
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
               c[sum]= Character.toUpperCase(str.charAt(i)); 
               sum++;
            }
            else if(str.charAt(i)==' ')
            {
              c[sum]= '*';  
              sum++;
            }
            else
            {
            	c[sum]=str.charAt(i);
            	sum++;
            }
        }
         for(int i=0;i<len;i++)
        {
           if(i==0)
           {
             str= Character.toString(c[i]);  
           }
           else if((i+1)%2==0)
           {
             str= str+Integer.toString((int) c[i]);  
           }
           else {
               str= str+Character.toString(c[i]);
           }
           
        }
         
            str= str+"7"; 
        
        
        return str;
    }
    public static String deciphering(String ciphered){
    	String str=ciphered,temp ="a";
    	char[] c=new char[str.length()];
    	int len=str.length(),sum=0,count=0;
    	 for(int i=0;i<len-1;i++)
         {
            if(i==0)
            {
              c[sum]=str.charAt(i); 
              sum++;
            }
            else if((int) str.charAt(i)>47 && (int) str.charAt(i)<58)
            {
                while((int) str.charAt(i)>47 && (int) str.charAt(i)<58)
                {
                	count=count*10 + Character.getNumericValue(str.charAt(i));
                	i++;
                	if(i>len-2)
                	{
                		break;
                	}
                }
                i--;
                c[sum]=(char)count;
                count=0;
                sum++;
            }
            else 
            {
            	c[sum]=str.charAt(i); 
            	sum++;
            }
            
         }
    	 
    	 for(int i=0;i<sum;i++)
         {
             if(Character.isUpperCase(c[i]))
             {
               c[i]= Character.toLowerCase(c[i]);
             }
             else if(Character.isLowerCase(c[i]))
             {
                c[i]= Character.toUpperCase(c[i]); 
                
             }
             else if(c[i]=='*')
             {
               c[i]= ' ';
               
             }
             else
             {
             	c[i]=c[i];
             	
             }
         }
    	 
    	 for(int i=sum-1;i>=0;i--)
    	 {
    		if(i==sum-1)
    		{
    			temp=Character.toString(c[i]);
    		}
    		else
    		{
    			temp=temp + Character.toString(c[i]);
    		}
    	 }
    	 
        return temp;
    }
    
}

    
    
    

