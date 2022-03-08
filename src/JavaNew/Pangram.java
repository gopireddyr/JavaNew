package JavaNew;
public class Pangram
{
	 public static void main(String args[])
	 {
		 int i=0,counts=26;
		 int[] count= new int[26];
		 System.out.println((int) 'A');
		 System.out.println((int) 'a');
		 
		 String str="The quick brown for jumps over the lazxy dog";
		 str=str.toUpperCase();
		 for(i=0;i<str.length();i++)
		 {
			 if((int) str.charAt(i) - 65 < 26 && (int) str.charAt(i) - 65 >=0 )
			 {
				 if(count[(int) str.charAt(i) -65]==0 )
				 {
					 count[(int) str.charAt(i) -65]=1; 
					 counts--;
					 if(counts==0)
					 {
						// System.out.print("Paragram");
					 }
				 } 
			 }
		 
		 
		 
		 }
		 if(counts==0)
		 {
			 System.out.print("Paragram");
		 }
		 else
			 System.out.print("Not Paragram");
	 }
}
