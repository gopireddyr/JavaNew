package JavaNew;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class A3_ID {
	public static int sum;
	public static int len;
	public static void main(String[] args) throws IOException {
		/* 1. Print Writer
		 save your name and id to a file called krishna.txt
		 */
		  String name;
		  name=JOptionPane.showInputDialog("Enter File Name To Access File : krishna");
		  if(name.equals("krishna"))
		  {
			  JOptionPane.showMessageDialog(null, "File is correct");
			  
			    creatfiles();
				Sum();
				Average(sum,len);
				creatfile();
				Name();
		  }
		  else
		  {

			  JOptionPane.showMessageDialog(null, "Invalid File Name");
		  }
}
	
	//create file
  public static void creatfiles() throws IOException
	{
		 File file = new File("./krishna.txt");
		 if ( file.createNewFile())
			{
			 //writing input
			 FileWriter writer = new FileWriter(file); 
			 writer.write("10,20,30,40,50,60,70,80,90,100");	
			 file.setExecutable(true); 
	         file.setReadable(true); 
	         file.setWritable(false);
	         writer.close();
			}
	}
	 
     public static void creatfile() throws IOException
	  	{
	  		 File file = new File("./krishna.txt");	  		
	  		 Scanner myReader = new Scanner(file);
	  	      while (myReader.hasNextLine()) {
	  	        String data = myReader.nextLine();
	  	        //printing input
	  	        //System.out.println(data);
	  	      JOptionPane.showMessageDialog(null,"List of numbers= "+ data);
	  	}
	  	}
	  	      
	  //Sum	   
	public static void Sum() throws IOException
		  	{
		  		 File file = new File("./krishna.txt");
		  		 //writing input
		  		int num=0;
		  		sum=0;
		  		 Scanner myReader = new Scanner(file);
		  		String data = ""; 
		  		 while (myReader.hasNextLine()) {
		  	         data = data + myReader.nextLine();
		  	        }
//		  	    String[] Str = data.split(",", 10);
		  		 int j=0;
		  		 int i=0;
		  		len=1;
		  	    for(i=0;i<data.length();i++)
		  	    {
		  	    	
		  	    	if(data.charAt(i)==',')
		  	    	{
		  	    		len++;
		  	    		String str=data.substring(j,i);
		  	    		num=Integer.valueOf(str);
			  	    	sum=sum+num;
			  	    	j=i+1;
		  	    	}
//		  	    	num[i]=Integer.valueOf(Str[i]);
//		  	    	sum=sum+num[i];
		  	    }
		  	  String str=data.substring(j,i);
	    		num=Integer.valueOf(str);
	  	    	sum=sum+num;
		  	  JOptionPane.showMessageDialog(null,"Total of the numbers= " + sum);
		  	   // System.out.println(sum);
				
				//Average(sum,len);
		  	    
             }
	//Average
	public static void Average(int num,int len) throws IOException
  	{
		
		
		  JOptionPane.showMessageDialog(null, "Average of the numbers= " + (float) num/len);
		 // System.out.println(sum/(num.length));
  	    
     }

public static void Name() throws IOException
	{
  	   
	  JOptionPane.showMessageDialog(null, "My name is saikrishna bitling");
	 // System.out.println(sum/(num.length));
	    
 }

}
